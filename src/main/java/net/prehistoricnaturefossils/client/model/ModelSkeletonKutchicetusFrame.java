package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonKutchicetusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer body6;
    private final ModelRenderer cube_r3;
    private final ModelRenderer body;
    private final ModelRenderer cube_r4;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer leftarm;
    private final ModelRenderer leftarm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer rightarm;
    private final ModelRenderer rightarm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r9;
    private final ModelRenderer head;
    private final ModelRenderer leftOrbit;
    private final ModelRenderer rightOrbit;
    private final ModelRenderer jaw;
    private final ModelRenderer bone;

    public ModelSkeletonKutchicetusFrame() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -13.1819F, -4.8833F);
        this.fossil.addChild(chest);
        this.setRotateAngle(chest, -0.5842F, -0.0241F, -0.0364F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 1.0665F, -1.2719F);
        this.chest.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.5708F, -1.213F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 3, -2.5F, -0.3F, -0.5F, 1, 2, 1, -0.16F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 15, -2, -2.5F, 0.8F, -3.0F, 1, 1, 6, -0.15F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.8854F, -3.7706F);
        this.chest.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3578F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 17, 0, -0.5F, 0.5447F, 0.2771F, 1, 1, 4, -0.15F, false));

        this.body6 = new ModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0624F, -0.0171F);
        this.chest.addChild(body6);
        this.setRotateAngle(body6, 0.2126F, 0.1707F, 0.0366F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.4F, 0.1F);
        this.body6.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0349F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 30, -0.5F, 0.4F, 0.0F, 1, 1, 3, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.3939F, 2.9994F);
        this.body6.addChild(body);
        this.setRotateAngle(body, -0.1507F, 0.272F, 0.0467F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.4433F, 8.9202F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1047F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 17, -0.5F, -0.2F, -9.2F, 1, 1, 4, -0.15F, false));

        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.1307F, 3.6903F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0879F, 0.4384F, -0.0057F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.2624F, -7.4423F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2094F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 41, 1, -0.5F, 0.6488F, 7.4474F, 1, 1, 3, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 0.1754F, 1.9491F);
        this.body2.addChild(hips);
        this.setRotateAngle(hips, 0.1484F, 0.0F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.5537F, 1.7648F);
        this.hips.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -1.5708F, -1.1257F, 1.5708F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 24, 17, -2.0F, 0.0F, -2.0F, 1, 1, 4, -0.15F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.4473F, 0.1279F);
        this.hips.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.4451F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 24, 17, -0.5F, 0.6014F, 0.3389F, 1, 1, 4, -0.15F, false));

        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 1.491F, 3.6799F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.2604F, -0.2067F, 0.2307F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 17, -0.5F, 0.4098F, -0.2618F, 1, 1, 5, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0495F, 4.8593F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0303F, -0.3574F, 0.0993F);
        this.tail2.cubeList.add(new ModelBox(tail2, 13, 7, -0.5F, 0.3006F, -0.5157F, 1, 1, 7, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0195F, 5.8983F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.2015F, -0.0855F, 0.0174F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 0, -0.5F, 0.2756F, -0.0278F, 1, 1, 7, -0.15F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(2.069F, 1.2686F, 0.2436F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.4918F, -0.2186F, -0.3126F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 2.3425F, -0.1162F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.2217F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0738F, 2.4219F, -0.3754F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 2.1584F, 1.1379F, -1.0956F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-2.069F, 1.2686F, 0.2436F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 0.599F, 0.2186F, 0.3126F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 2.3425F, -0.1162F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.829F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.0738F, 2.4219F, -0.3754F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 1.8441F, -0.5325F, 1.4981F);


        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(2.8098F, 2.8507F, -3.0759F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, -0.6111F, -0.067F, -0.2533F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(-0.0768F, 1.8668F, 1.7871F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -2.9637F, 1.393F, -2.5739F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(-0.2F, 2.5778F, 0.3785F);
        this.leftarm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.1612F, -0.4629F, 0.5462F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-2.8098F, 2.8507F, -3.0759F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.4798F, 0.067F, 0.2533F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(0.0768F, 1.8668F, 1.7871F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, 2.0862F, -1.2099F, -2.4451F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(0.2F, 2.5778F, 0.3785F);
        this.rightarm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.181F, 0.0459F, -0.1696F);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 1.2539F, -3.7545F);
        this.chest.addChild(neck2);
        this.setRotateAngle(neck2, 0.0791F, -0.0453F, -0.044F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.1313F, 0.0158F);
        this.neck2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0698F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 29, 43, -0.5F, 0.2685F, -2.0645F, 1, 1, 3, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.0299F, -1.7964F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.0452F, -0.2615F, 0.0117F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0049F, -0.0064F);
        this.neck.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0524F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 42, 15, -0.5F, 0.234F, -1.716F, 1, 1, 2, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.3494F, -2.4824F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.8863F, -0.2486F, 0.2476F);


        this.leftOrbit = new ModelRenderer(this);
        this.leftOrbit.setRotationPoint(2.2F, 0.4933F, -1.5002F);
        this.head.addChild(leftOrbit);


        this.rightOrbit = new ModelRenderer(this);
        this.rightOrbit.setRotationPoint(-2.2F, 0.4933F, -1.5002F);
        this.head.addChild(rightOrbit);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.6F, 0.1442F, -0.1346F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 1.4748F, 0.0F, 0.0F);


        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.neck2.addChild(bone);

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
