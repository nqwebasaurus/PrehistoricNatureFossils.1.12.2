package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonYunguisaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer Yunguisaurus;
    private final ModelRenderer body;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r6;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r7;
    private final ModelRenderer neck5;
    private final ModelRenderer cube_r8;
    private final ModelRenderer head;
    private final ModelRenderer lowerjaw;
    private final ModelRenderer leftarm;
    private final ModelRenderer flipper3;
    private final ModelRenderer rightarm;
    private final ModelRenderer flipper2;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer leftbackflipper;
    private final ModelRenderer flipper4;
    private final ModelRenderer rightbackflipper;
    private final ModelRenderer flipper5;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer tail6;
    private final ModelRenderer tail7;

    public ModelSkeletonYunguisaurusFrame() {
        this.textureWidth = 68;
        this.textureHeight = 68;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Yunguisaurus = new ModelRenderer(this);
        this.Yunguisaurus.setRotationPoint(0.5F, 0.0F, 7.0F);
        this.fossil.addChild(Yunguisaurus);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -6.0F, -8.0F);
        this.Yunguisaurus.addChild(body);
        this.setRotateAngle(body, 0.3491F, 0.0F, 0.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(1.5664F, 0.1773F, -1.3353F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0349F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 22, 18, -2.5664F, 0.3227F, -0.0647F, 1, 1, 9, -0.03F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, 0.5F, -7.9F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 39, 27, -0.5F, 0.6F, 1.3F, 1, 1, 6, -0.03F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(-0.5F, 0.3F, -6.7F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, 0.0F, 0.0F, 0.0F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 2.8805F, -2.8093F);
        this.neck.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0436F, -0.2182F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 3, 54, 0.5F, -3.5F, -0.5F, 1, 7, 1, -0.03F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.7F, -3.6F);
        this.neck.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2182F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 3, 54, -0.5F, 1.1F, -0.2F, 1, 2, 1, -0.03F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 51, -0.5F, 0.8F, -0.2F, 1, 1, 4, -0.03F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.8F, -2.9F);
        this.neck.addChild(neck2);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 0.75F, 0.05F);
        this.neck2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0435F, 0.0038F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 41, 54, -1.0F, -0.1497F, -4.0151F, 1, 1, 4, -0.03F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.4F, -2.9F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.0374F, 0.3027F, -0.0411F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.9995F, 0.4782F);
        this.neck3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0262F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 37, -0.5F, -0.5F, -7.5F, 1, 1, 7, -0.03F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -0.1005F, -6.7718F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, -0.1351F, 0.3281F, -0.1548F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.4556F, 0.4073F, -6.7918F);
        this.neck4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.027F, -0.0343F, 0.2609F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 33, 13, -0.9556F, 0.4443F, -0.4043F, 1, 1, 8, -0.03F, false));

        this.neck5 = new ModelRenderer(this);
        this.neck5.setRotationPoint(-0.0444F, 0.3573F, -6.6418F);
        this.neck4.addChild(neck5);
        this.setRotateAngle(neck5, 0.0028F, 0.3487F, 0.0159F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 0.75F, -7.05F);
        this.neck5.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0262F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 27, -0.7056F, -0.1F, -1.25F, 1, 1, 8, -0.03F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(-0.25F, -0.3015F, -6.9826F);
        this.neck5.addChild(head);
        this.setRotateAngle(head, 0.0272F, 0.445F, 0.0692F);


        this.lowerjaw = new ModelRenderer(this);
        this.lowerjaw.setRotationPoint(-0.25F, 0.9779F, 0.0478F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 0.365F, 0.0037F, -0.0338F);


        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(3.5F, 3.7F, -1.8F);
        this.neck.addChild(leftarm);
        this.setRotateAngle(leftarm, 0.264F, 0.1264F, -0.1405F);


        this.flipper3 = new ModelRenderer(this);
        this.flipper3.setRotationPoint(4.3F, 0.0F, -0.7F);
        this.leftarm.addChild(flipper3);
        this.setRotateAngle(flipper3, 0.0F, 0.0F, -0.1745F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-3.5F, 3.7F, -1.8F);
        this.neck.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.3518F, -0.123F, 0.3041F);


        this.flipper2 = new ModelRenderer(this);
        this.flipper2.setRotationPoint(-4.3F, 0.0F, -0.7F);
        this.rightarm.addChild(flipper2);
        this.setRotateAngle(flipper2, 0.0F, 0.0F, 0.2182F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, 0.4F, 7.5F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, -0.0436F, 0.0F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 4.3226F, 2.948F);
        this.tail.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.1309F, 1.5708F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 48, 16, -1.5F, -3.5F, -0.5F, 1, 7, 1, -0.03F, false));

        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.1F, 0.0F);
        this.tail.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1309F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 48, 16, -0.5F, 0.5F, 3.0F, 1, 3, 1, -0.03F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 44, 12, -0.5F, 0.5F, 0.0F, 1, 1, 5, -0.03F, false));

        this.leftbackflipper = new ModelRenderer(this);
        this.leftbackflipper.setRotationPoint(4.35F, 3.2F, 3.5F);
        this.tail.addChild(leftbackflipper);
        this.setRotateAngle(leftbackflipper, -0.0748F, -0.3955F, 0.6999F);


        this.flipper4 = new ModelRenderer(this);
        this.flipper4.setRotationPoint(4.25F, -0.2F, -0.8F);
        this.leftbackflipper.addChild(flipper4);
        this.setRotateAngle(flipper4, -0.1231F, -0.2316F, 0.1016F);


        this.rightbackflipper = new ModelRenderer(this);
        this.rightbackflipper.setRotationPoint(-4.35F, 3.2F, 3.5F);
        this.tail.addChild(rightbackflipper);
        this.setRotateAngle(rightbackflipper, 0.0883F, 0.3289F, -0.8756F);


        this.flipper5 = new ModelRenderer(this);
        this.flipper5.setRotationPoint(-4.25F, -0.2F, -0.8F);
        this.rightbackflipper.addChild(flipper5);
        this.setRotateAngle(flipper5, -0.1128F, 0.2368F, -0.0571F);


        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.5504F, 4.4591F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 50, 49, -0.5F, 0.4496F, 0.0409F, 1, 1, 4, -0.03F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0504F, 3.8909F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0349F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 11, 27, -0.5F, 0.4772F, -0.1331F, 1, 1, 6, -0.03F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.1228F, 5.8669F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1222F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 29, 31, -0.4564F, 0.5992F, -1.0304F, 1, 1, 7, -0.03F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.5436F, 0.0992F, 5.9696F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1745F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 42, 42, -1.0436F, 0.5F, 0.0F, 1, 1, 5, -0.03F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(-0.5F, -0.1F, 5.05F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.3316F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 17, 38, -0.5436F, 0.6F, -0.3F, 1, 1, 6, -0.03F, false));

        this.tail7 = new ModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, 0.1F, 5.5F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.3927F, 0.0F, 0.0F);
        this.tail7.cubeList.add(new ModelBox(tail7, 19, 29, -0.5436F, 0.4957F, 0.0653F, 1, 1, 7, -0.03F, false));

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
