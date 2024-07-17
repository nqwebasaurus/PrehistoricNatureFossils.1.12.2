package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonLuskhanFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer main;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer leftbackflipper;
    private final ModelRenderer leftbackflipper2;
    private final ModelRenderer leftbackflipper3;
    private final ModelRenderer leftbackflipper4;
    private final ModelRenderer rightbackflipper;
    private final ModelRenderer rightbackflipper2;
    private final ModelRenderer rightbackflipper3;
    private final ModelRenderer rightbackflipper4;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r6;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer cube_r7;
    private final ModelRenderer tail6;
    private final ModelRenderer cube_r8;
    private final ModelRenderer body;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer leftfrontflipper;
    private final ModelRenderer leftfrontflipper2;
    private final ModelRenderer leftfrontflipper3;
    private final ModelRenderer leftfrontflipper4;
    private final ModelRenderer rightfrontflipper;
    private final ModelRenderer rightfrontflipper2;
    private final ModelRenderer rightfrontflipper3;
    private final ModelRenderer rightfrontflipper4;
    private final ModelRenderer body2;
    private final ModelRenderer body3;
    private final ModelRenderer cube_r11;
    private final ModelRenderer head;
    private final ModelRenderer jaw;

    public ModelSkeletonLuskhanFrame() {
        this.textureWidth = 112;
        this.textureHeight = 112;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, -2.0F, 10.0F);
        this.setRotateAngle(fossil, 0.0F, 0.0F, 0.0436F);


        this.main = new ModelRenderer(this);
        this.main.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.fossil.addChild(main);
        this.setRotateAngle(main, -0.3328F, 0.1704F, 0.0906F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.3F, -5.5F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0698F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 19, -0.5F, 0.8463F, 0.1547F, 1, 2, 12, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.4F, 6.5F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0175F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 34, -0.5F, 1.1F, 0.0F, 1, 2, 10, 0.003F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.8861F, 17.1744F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.262F, 0.0421F, -0.0113F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 5.2556F, 8.6239F);
        this.tail.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -1.5708F, 0.0698F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 16, 28, -1.6F, -0.5F, -6.5F, 1, 1, 13, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 1.5095F, 4.8534F);
        this.tail.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -1.501F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 23, 35, -0.5F, -4.0F, -0.5F, 1, 1, 6, -0.003F, false));

        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0318F, -0.7058F);
        this.tail.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0698F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 18, 30, -0.5F, 0.8619F, -0.0574F, 1, 2, 11, 0.0F, false));

        this.leftbackflipper = new ModelRenderer(this);
        this.leftbackflipper.setRotationPoint(6.25F, 6.3383F, 6.7991F);
        this.tail.addChild(leftbackflipper);
        this.setRotateAngle(leftbackflipper, 0.7232F, 0.2799F, -0.8476F);


        this.leftbackflipper2 = new ModelRenderer(this);
        this.leftbackflipper2.setRotationPoint(0.0F, 15.75F, 0.7F);
        this.leftbackflipper.addChild(leftbackflipper2);
        this.setRotateAngle(leftbackflipper2, 0.0872F, -0.0038F, 0.0435F);


        this.leftbackflipper3 = new ModelRenderer(this);
        this.leftbackflipper3.setRotationPoint(0.0F, 2.65F, -0.15F);
        this.leftbackflipper2.addChild(leftbackflipper3);
        this.setRotateAngle(leftbackflipper3, 0.0F, 0.0F, 0.1745F);


        this.leftbackflipper4 = new ModelRenderer(this);
        this.leftbackflipper4.setRotationPoint(0.1F, 5.0F, 0.0F);
        this.leftbackflipper3.addChild(leftbackflipper4);


        this.rightbackflipper = new ModelRenderer(this);
        this.rightbackflipper.setRotationPoint(-6.25F, 6.3383F, 6.7991F);
        this.tail.addChild(rightbackflipper);
        this.setRotateAngle(rightbackflipper, 0.8901F, -0.2126F, 0.8537F);


        this.rightbackflipper2 = new ModelRenderer(this);
        this.rightbackflipper2.setRotationPoint(0.0F, 15.75F, 0.7F);
        this.rightbackflipper.addChild(rightbackflipper2);
        this.setRotateAngle(rightbackflipper2, 0.0852F, -0.0189F, 0.2174F);


        this.rightbackflipper3 = new ModelRenderer(this);
        this.rightbackflipper3.setRotationPoint(0.0F, 2.65F, -0.15F);
        this.rightbackflipper2.addChild(rightbackflipper3);
        this.setRotateAngle(rightbackflipper3, 0.0F, 0.0F, -0.2182F);


        this.rightbackflipper4 = new ModelRenderer(this);
        this.rightbackflipper4.setRotationPoint(-0.1F, 5.0F, 0.0F);
        this.rightbackflipper3.addChild(rightbackflipper4);


        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(-0.25F, 0.0629F, 9.8315F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0882F, 0.2616F, 0.0039F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.25F, -0.9F, 0.4F);
        this.tail2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0349F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 52, 45, -0.5F, 1.0F, 0.0F, 1, 2, 7, 0.003F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.25F, 0.0F, 7.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0F, 0.1745F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 20, 80, -0.5F, 0.35F, 0.1F, 1, 2, 4, 0.0F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.1F, 4.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0873F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 33, 97, -0.5F, 0.3019F, -0.1436F, 1, 1, 3, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0019F, 2.9564F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0536F, 0.2179F, 0.0116F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.7503F, 2.0131F);
        this.tail5.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0137F, 0.0065F, -0.0024F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 82, 77, -0.4F, -0.5F, -2.5F, 1, 1, 5, -0.15F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0003F, 3.6131F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.1354F, 0.2039F, -0.0865F);
        this.tail6.cubeList.add(new ModelBox(tail6, 83, 55, -0.5F, 0.3037F, 0.2609F, 1, 1, 4, -0.15F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 0.5037F, 3.9609F);
        this.tail6.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1222F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 97, 17, 0.0F, -0.2019F, -0.0576F, 1, 1, 3, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(-0.5F, 0.25F, -5.0F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.1752F, 0.0859F, 0.0152F);
        this.body.cubeList.add(new ModelBox(body, 51, 0, 0.0F, 0.2496F, -8.147F, 1, 2, 8, 0.003F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 4.2496F, -4.647F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 1.5708F, 0.0F, 1.5708F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 44, -7, 0.5F, -0.5F, -7.5F, 1, 1, 15, 0.003F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 1.2496F, -4.147F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 1.5708F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 55, 4, -0.5F, -1.0F, -4.3F, 1, 1, 4, 0.0F, false));

        this.leftfrontflipper = new ModelRenderer(this);
        this.leftfrontflipper.setRotationPoint(8.55F, 5.126F, -5.0818F);
        this.body.addChild(leftfrontflipper);
        this.setRotateAngle(leftfrontflipper, 0.0557F, 0.0963F, -1.9547F);


        this.leftfrontflipper2 = new ModelRenderer(this);
        this.leftfrontflipper2.setRotationPoint(-1.5159F, 5.0586F, -2.2609F);
        this.leftfrontflipper.addChild(leftfrontflipper2);
        this.setRotateAngle(leftfrontflipper2, 0.0848F, -0.0016F, 0.1105F);


        this.leftfrontflipper3 = new ModelRenderer(this);
        this.leftfrontflipper3.setRotationPoint(2.0F, 5.95F, 2.75F);
        this.leftfrontflipper2.addChild(leftfrontflipper3);
        this.setRotateAngle(leftfrontflipper3, 0.1074F, 0.0749F, -0.6068F);


        this.leftfrontflipper4 = new ModelRenderer(this);
        this.leftfrontflipper4.setRotationPoint(0.1F, 6.9829F, -0.2611F);
        this.leftfrontflipper3.addChild(leftfrontflipper4);


        this.rightfrontflipper = new ModelRenderer(this);
        this.rightfrontflipper.setRotationPoint(-7.55F, 5.126F, -5.0818F);
        this.body.addChild(rightfrontflipper);
        this.setRotateAngle(rightfrontflipper, -0.2126F, -0.1748F, 1.9576F);


        this.rightfrontflipper2 = new ModelRenderer(this);
        this.rightfrontflipper2.setRotationPoint(1.5159F, 5.0586F, -2.2609F);
        this.rightfrontflipper.addChild(rightfrontflipper2);
        this.setRotateAngle(rightfrontflipper2, 0.0848F, 0.0016F, -0.1105F);


        this.rightfrontflipper3 = new ModelRenderer(this);
        this.rightfrontflipper3.setRotationPoint(-2.0F, 5.95F, 2.75F);
        this.rightfrontflipper2.addChild(rightfrontflipper3);
        this.setRotateAngle(rightfrontflipper3, 0.121F, -0.05F, 0.3897F);


        this.rightfrontflipper4 = new ModelRenderer(this);
        this.rightfrontflipper4.setRotationPoint(-0.1F, 6.9829F, -0.2611F);
        this.rightfrontflipper3.addChild(rightfrontflipper4);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.5F, 0.276F, -9.1318F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.176F, 0.2175F, 0.0078F);
        this.body2.cubeList.add(new ModelBox(body2, 61, 13, -0.5F, 0.0F, -5.0F, 1, 2, 6, 0.0F, false));

        this.body3 = new ModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, -4.25F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.2829F, 0.179F, 0.1115F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.875F, -8.8F);
        this.body3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1222F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 36, 39, -0.5F, -0.0685F, -0.5956F, 1, 2, 9, 0.003F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.25F, -9.0F);
        this.body3.addChild(head);
        this.setRotateAngle(head, 0.0735F, 0.418F, 0.1783F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(-1.0F, 2.809F, -0.1209F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.48F, 0.0F, 0.0F);

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
