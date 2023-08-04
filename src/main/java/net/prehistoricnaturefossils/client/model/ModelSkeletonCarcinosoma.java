package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCarcinosoma extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer body;
    private final ModelRenderer eyeR_r1;
    private final ModelRenderer eyeL_r1;
    private final ModelRenderer carapace5_r1;
    private final ModelRenderer carapace4_r1;
    private final ModelRenderer segments;
    private final ModelRenderer metasoma1;
    private final ModelRenderer metasoma2;
    private final ModelRenderer metasoma3;
    private final ModelRenderer metasoma4;
    private final ModelRenderer metasoma5;
    private final ModelRenderer telson;
    private final ModelRenderer spine3_r1;
    private final ModelRenderer leg1L;
    private final ModelRenderer leg2L;
    private final ModelRenderer leg2L2;
    private final ModelRenderer leg2L3;
    private final ModelRenderer leg3L;
    private final ModelRenderer leg3L2;
    private final ModelRenderer leg3L3;
    private final ModelRenderer leg4L;
    private final ModelRenderer leg4L2;
    private final ModelRenderer leg4L3;
    private final ModelRenderer leg5L;
    private final ModelRenderer leg5L2;
    private final ModelRenderer leg5L3;
    private final ModelRenderer leg1R;
    private final ModelRenderer leg2R;
    private final ModelRenderer leg2R2;
    private final ModelRenderer leg2R3;
    private final ModelRenderer leg3R;
    private final ModelRenderer leg3R2;
    private final ModelRenderer leg3R3;
    private final ModelRenderer leg4R;
    private final ModelRenderer leg4R2;
    private final ModelRenderer leg4R3;
    private final ModelRenderer leg5R;
    private final ModelRenderer leg5R2;
    private final ModelRenderer leg5R3;

    public ModelSkeletonCarcinosoma() {
        this.textureWidth = 133;
        this.textureHeight = 100;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 0, 34, -17.0F, -2.0F, -18.0F, 33, 2, 31, 0.003F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -1.0F, 12.0F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.5236F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -19.5F, -1.0F, -7.7F, 34, 2, 31, -0.003F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(9.0F, -1.0F, -19.0F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.6109F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 68, -20.8F, -1.0F, -13.2F, 26, 2, 18, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.fossil.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 26, -4.5F, 0.5F, -3.0F, 9, 0, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 34, -2.0F, 0.5F, -8.0F, 4, 0, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 29, -3.0F, 0.5F, -4.0F, 6, 0, 1, 0.0F, false));

        this.eyeR_r1 = new ModelRenderer(this);
        this.eyeR_r1.setRotationPoint(0.0F, 1.7F, 0.0F);
        this.body.addChild(eyeR_r1);
        this.setRotateAngle(eyeR_r1, 0.0F, -0.4363F, 0.0F);
        this.eyeR_r1.cubeList.add(new ModelBox(eyeR_r1, 77, 92, -5.25F, -1.25F, -6.5F, 1, 0, 2, 0.0F, false));

        this.eyeL_r1 = new ModelRenderer(this);
        this.eyeL_r1.setRotationPoint(0.0F, 1.7F, 0.0F);
        this.body.addChild(eyeL_r1);
        this.setRotateAngle(eyeL_r1, 0.0F, 0.4363F, 0.0F);
        this.eyeL_r1.cubeList.add(new ModelBox(eyeL_r1, 82, 93, 4.25F, -1.25F, -6.5F, 1, 0, 2, 0.0F, false));

        this.carapace5_r1 = new ModelRenderer(this);
        this.carapace5_r1.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.body.addChild(carapace5_r1);
        this.setRotateAngle(carapace5_r1, 0.0F, -0.5236F, 0.0F);
        this.carapace5_r1.cubeList.add(new ModelBox(carapace5_r1, 10, 40, -5.25F, 0.01F, -5.25F, 2, 0, 5, 0.0F, false));

        this.carapace4_r1 = new ModelRenderer(this);
        this.carapace4_r1.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.body.addChild(carapace4_r1);
        this.setRotateAngle(carapace4_r1, 0.0F, 0.5236F, 0.0F);
        this.carapace4_r1.cubeList.add(new ModelBox(carapace4_r1, 0, 45, 3.25F, 0.01F, -5.25F, 2, 0, 5, 0.0F, false));

        this.segments = new ModelRenderer(this);
        this.segments.setRotationPoint(0.0F, -0.5F, -1.0F);
        this.body.addChild(segments);
        this.setRotateAngle(segments, 0.0F, -0.0436F, 0.0F);
        this.segments.cubeList.add(new ModelBox(segments, 0, 0, -3.0F, 0.97F, 0.0F, 6, 0, 7, 0.0F, false));
        this.segments.cubeList.add(new ModelBox(segments, 0, 14, -2.5F, 1.0F, 7.001F, 5, 0, 6, 0.0F, false));
        this.segments.cubeList.add(new ModelBox(segments, 0, 21, -5.5F, 1.15F, 0.0F, 11, 0, 1, 0.0F, false));
        this.segments.cubeList.add(new ModelBox(segments, 0, 11, -6.0F, 1.15F, 1.0F, 12, 0, 2, 0.0F, false));
        this.segments.cubeList.add(new ModelBox(segments, 0, 8, -6.5F, 1.15F, 9.0F, 13, 0, 2, 0.0F, false));
        this.segments.cubeList.add(new ModelBox(segments, 0, 23, -4.5F, 1.15F, 11.0F, 9, 0, 2, 0.0F, false));
        this.segments.cubeList.add(new ModelBox(segments, 71, 68, -7.0F, 1.15F, 3.0F, 14, 0, 6, 0.0F, false));

        this.metasoma1 = new ModelRenderer(this);
        this.metasoma1.setRotationPoint(0.0F, 0.1F, 12.7F);
        this.segments.addChild(metasoma1);
        this.setRotateAngle(metasoma1, 0.0F, -0.1745F, 0.0F);
        this.metasoma1.cubeList.add(new ModelBox(metasoma1, 71, 75, -1.99F, 0.99F, 0.0F, 4, 0, 3, 0.0F, false));

        this.metasoma2 = new ModelRenderer(this);
        this.metasoma2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.metasoma1.addChild(metasoma2);
        this.metasoma2.cubeList.add(new ModelBox(metasoma2, 15, 61, -2.0F, 1.0F, 0.0F, 4, 0, 3, 0.0F, false));

        this.metasoma3 = new ModelRenderer(this);
        this.metasoma3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.metasoma2.addChild(metasoma3);
        this.setRotateAngle(metasoma3, 0.0F, -0.3491F, 0.0F);
        this.metasoma3.cubeList.add(new ModelBox(metasoma3, 0, 56, -1.5F, 0.99F, 0.0F, 3, 0, 4, 0.0F, false));

        this.metasoma4 = new ModelRenderer(this);
        this.metasoma4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.metasoma3.addChild(metasoma4);
        this.setRotateAngle(metasoma4, 0.0F, -0.3927F, 0.0F);
        this.metasoma4.cubeList.add(new ModelBox(metasoma4, 0, 51, -1.49F, 1.0F, 0.0F, 3, 0, 4, 0.0F, false));

        this.metasoma5 = new ModelRenderer(this);
        this.metasoma5.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.metasoma4.addChild(metasoma5);
        this.setRotateAngle(metasoma5, 0.0F, -0.3927F, 0.0F);
        this.metasoma5.cubeList.add(new ModelBox(metasoma5, 11, 49, -1.5F, 0.99F, 0.0F, 3, 0, 4, 0.0F, false));
        this.metasoma5.cubeList.add(new ModelBox(metasoma5, 87, 87, -2.0F, 1.05F, 1.75F, 4, 0, 2, 0.0F, false));

        this.telson = new ModelRenderer(this);
        this.telson.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.metasoma5.addChild(telson);
        this.setRotateAngle(telson, -0.3124F, 0.0F, 1.5042F);
        this.telson.cubeList.add(new ModelBox(telson, 0, 14, 1.0F, -1.0F, 0.0F, 0, 2, 2, 0.0F, false));
        this.telson.cubeList.add(new ModelBox(telson, 20, 0, 1.0F, -0.5F, 2.0F, 0, 1, 5, 0.0F, false));

        this.spine3_r1 = new ModelRenderer(this);
        this.spine3_r1.setRotationPoint(0.5F, 1.0F, -30.0F);
        this.telson.addChild(spine3_r1);
        this.setRotateAngle(spine3_r1, -0.5236F, 0.0F, 0.0F);
        this.spine3_r1.cubeList.add(new ModelBox(spine3_r1, 0, 0, 0.501F, -19.75F, 31.25F, 0, 1, 3, 0.0F, false));

        this.leg1L = new ModelRenderer(this);
        this.leg1L.setRotationPoint(0.75F, 0.2F, -7.25F);
        this.body.addChild(leg1L);
        this.setRotateAngle(leg1L, 0.0F, -0.3491F, 0.0F);
        this.leg1L.cubeList.add(new ModelBox(leg1L, 12, 34, -2.0F, 0.499F, -5.0F, 2, 0, 5, 0.0F, false));
        this.leg1L.cubeList.add(new ModelBox(leg1L, 17, 14, 0.0F, 0.401F, -5.0F, 1, 0, 5, 0.0F, false));

        this.leg2L = new ModelRenderer(this);
        this.leg2L.setRotationPoint(1.5F, 0.3F, -6.0F);
        this.body.addChild(leg2L);
        this.setRotateAngle(leg2L, 0.0F, 0.5672F, 0.0F);
        this.leg2L.cubeList.add(new ModelBox(leg2L, 0, 82, -1.0F, 0.4F, -1.0F, 5, 0, 2, 0.0F, false));
        this.leg2L.cubeList.add(new ModelBox(leg2L, 65, 89, 0.0F, 0.5F, -3.0F, 4, 0, 2, 0.0F, false));

        this.leg2L2 = new ModelRenderer(this);
        this.leg2L2.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.leg2L.addChild(leg2L2);
        this.setRotateAngle(leg2L2, 0.0F, 0.9599F, 0.0F);
        this.leg2L2.cubeList.add(new ModelBox(leg2L2, 26, 89, 0.0F, 0.401F, -1.0F, 4, 0, 2, 0.0F, false));
        this.leg2L2.cubeList.add(new ModelBox(leg2L2, 39, 89, 0.0F, 0.501F, -3.0F, 4, 0, 2, 0.0F, false));

        this.leg2L3 = new ModelRenderer(this);
        this.leg2L3.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.leg2L2.addChild(leg2L3);
        this.setRotateAngle(leg2L3, 0.0F, 0.5672F, 0.0F);
        this.leg2L3.cubeList.add(new ModelBox(leg2L3, 52, 89, 0.0F, 0.5F, -2.5F, 4, 0, 2, 0.0F, false));
        this.leg2L3.cubeList.add(new ModelBox(leg2L3, 85, 81, 0.0F, 0.4F, -0.5F, 4, 0, 1, 0.0F, false));

        this.leg3L = new ModelRenderer(this);
        this.leg3L.setRotationPoint(2.5F, 0.3F, -4.25F);
        this.body.addChild(leg3L);
        this.setRotateAngle(leg3L, 0.0F, 0.3491F, 0.0F);
        this.leg3L.cubeList.add(new ModelBox(leg3L, 71, 79, -1.0F, 0.4F, -1.0F, 5, 0, 2, 0.0F, false));
        this.leg3L.cubeList.add(new ModelBox(leg3L, 84, 78, 0.0F, 0.5F, -3.0F, 4, 0, 2, 0.0F, false));

        this.leg3L2 = new ModelRenderer(this);
        this.leg3L2.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.leg3L.addChild(leg3L2);
        this.setRotateAngle(leg3L2, 0.0F, 0.4363F, 0.0F);
        this.leg3L2.cubeList.add(new ModelBox(leg3L2, 55, 92, 0.0F, 0.501F, -3.0F, 3, 0, 2, 0.0F, false));
        this.leg3L2.cubeList.add(new ModelBox(leg3L2, 66, 92, 0.0F, 0.401F, -1.0F, 3, 0, 2, 0.0F, false));

        this.leg3L3 = new ModelRenderer(this);
        this.leg3L3.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.leg3L2.addChild(leg3L3);
        this.setRotateAngle(leg3L3, 0.0F, 0.3491F, 0.0F);
        this.leg3L3.cubeList.add(new ModelBox(leg3L3, 22, 51, 0.0F, 0.4F, -0.5F, 3, 0, 1, 0.0F, false));
        this.leg3L3.cubeList.add(new ModelBox(leg3L3, 44, 92, 0.0F, 0.5F, -2.5F, 3, 0, 2, 0.0F, false));

        this.leg4L = new ModelRenderer(this);
        this.leg4L.setRotationPoint(2.0F, 0.3F, -2.5F);
        this.body.addChild(leg4L);
        this.setRotateAngle(leg4L, 0.0F, -0.1745F, 0.0F);
        this.leg4L.cubeList.add(new ModelBox(leg4L, 83, 75, 0.0F, 0.4F, -1.0F, 4, 0, 2, 0.0F, false));
        this.leg4L.cubeList.add(new ModelBox(leg4L, 71, 82, 0.0F, 0.5F, -3.0F, 4, 0, 2, 0.0F, false));

        this.leg4L2 = new ModelRenderer(this);
        this.leg4L2.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.leg4L.addChild(leg4L2);
        this.setRotateAngle(leg4L2, 0.0F, 0.0436F, 0.0F);
        this.leg4L2.cubeList.add(new ModelBox(leg4L2, 0, 92, 0.0F, 0.501F, -3.0F, 3, 0, 2, 0.0F, false));
        this.leg4L2.cubeList.add(new ModelBox(leg4L2, 87, 90, 0.0F, 0.401F, -1.0F, 3, 0, 2, 0.0F, false));

        this.leg4L3 = new ModelRenderer(this);
        this.leg4L3.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.leg4L2.addChild(leg4L3);
        this.setRotateAngle(leg4L3, 0.0F, -0.1745F, 0.0F);
        this.leg4L3.cubeList.add(new ModelBox(leg4L3, 22, 36, 0.0F, 0.4F, -0.5F, 3, 0, 1, 0.0F, false));
        this.leg4L3.cubeList.add(new ModelBox(leg4L3, 78, 89, 0.0F, 0.5F, -2.5F, 3, 0, 2, 0.0F, false));

        this.leg5L = new ModelRenderer(this);
        this.leg5L.setRotationPoint(4.0F, -0.1F, -1.0F);
        this.body.addChild(leg5L);
        this.setRotateAngle(leg5L, 0.0F, -0.4363F, 0.0F);
        this.leg5L.cubeList.add(new ModelBox(leg5L, 13, 54, 0.0F, 1.0F, -1.0F, 6, 0, 2, 0.0F, false));

        this.leg5L2 = new ModelRenderer(this);
        this.leg5L2.setRotationPoint(6.0F, 0.0F, 0.0F);
        this.leg5L.addChild(leg5L2);
        this.setRotateAngle(leg5L2, 0.0F, -0.7418F, 0.0F);
        this.leg5L2.cubeList.add(new ModelBox(leg5L2, 0, 72, 0.0F, 1.001F, -1.0F, 4, 0, 3, 0.0F, false));

        this.leg5L3 = new ModelRenderer(this);
        this.leg5L3.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.leg5L2.addChild(leg5L3);
        this.setRotateAngle(leg5L3, 0.0F, -0.2618F, 0.0F);
        this.leg5L3.cubeList.add(new ModelBox(leg5L3, 0, 68, 0.0F, 1.0F, -1.0F, 4, 0, 3, 0.0F, false));
        this.leg5L3.cubeList.add(new ModelBox(leg5L3, 23, 21, 4.0F, 1.0F, 0.0F, 1, 0, 2, 0.0F, false));

        this.leg1R = new ModelRenderer(this);
        this.leg1R.setRotationPoint(-0.75F, 0.1F, -7.25F);
        this.body.addChild(leg1R);
        this.setRotateAngle(leg1R, 0.0F, 0.3491F, 0.0F);
        this.leg1R.cubeList.add(new ModelBox(leg1R, 18, 24, -1.0F, 0.401F, -5.0F, 1, 0, 5, 0.0F, false));
        this.leg1R.cubeList.add(new ModelBox(leg1R, 0, 39, 0.0F, 0.499F, -5.0F, 2, 0, 5, 0.0F, false));

        this.leg2R = new ModelRenderer(this);
        this.leg2R.setRotationPoint(-1.5F, 0.2F, -6.0F);
        this.body.addChild(leg2R);
        this.setRotateAngle(leg2R, 0.0F, -0.7418F, 0.0F);
        this.leg2R.cubeList.add(new ModelBox(leg2R, 0, 79, -4.0F, 0.4F, -1.0F, 5, 0, 2, 0.0F, false));
        this.leg2R.cubeList.add(new ModelBox(leg2R, 13, 89, -4.0F, 0.5F, -3.0F, 4, 0, 2, 0.0F, false));

        this.leg2R2 = new ModelRenderer(this);
        this.leg2R2.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.leg2R.addChild(leg2R2);
        this.setRotateAngle(leg2R2, 0.0F, -0.3491F, 0.0F);


        this.leg2R3 = new ModelRenderer(this);
        this.leg2R3.setRotationPoint(-4.0F, 0.0F, 5.0F);
        this.leg2R2.addChild(leg2R3);
        this.setRotateAngle(leg2R3, -3.1416F, 1.3963F, 3.1416F);
        this.leg2R3.cubeList.add(new ModelBox(leg2R3, 0, 89, -4.0F, 0.5F, -2.5F, 4, 0, 2, 0.0F, false));
        this.leg2R3.cubeList.add(new ModelBox(leg2R3, 20, 43, -4.0F, 0.4F, -0.5F, 4, 0, 1, 0.0F, false));

        this.leg3R = new ModelRenderer(this);
        this.leg3R.setRotationPoint(-2.5F, 0.3F, -4.25F);
        this.body.addChild(leg3R);
        this.setRotateAngle(leg3R, 0.0F, -0.1309F, 0.0F);
        this.leg3R.cubeList.add(new ModelBox(leg3R, 0, 76, -4.0F, 0.4F, -1.0F, 5, 0, 2, 0.0F, false));
        this.leg3R.cubeList.add(new ModelBox(leg3R, 82, 83, -4.0F, 0.5F, -3.0F, 4, 0, 2, 0.0F, false));

        this.leg3R2 = new ModelRenderer(this);
        this.leg3R2.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.leg3R.addChild(leg3R2);
        this.setRotateAngle(leg3R2, 0.0F, -0.9163F, 0.0F);
        this.leg3R2.cubeList.add(new ModelBox(leg3R2, 33, 92, -3.0F, 0.501F, -3.0F, 3, 0, 2, 0.0F, false));
        this.leg3R2.cubeList.add(new ModelBox(leg3R2, 22, 92, -3.0F, 0.401F, -1.0F, 3, 0, 2, 0.0F, false));

        this.leg3R3 = new ModelRenderer(this);
        this.leg3R3.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.leg3R2.addChild(leg3R3);
        this.setRotateAngle(leg3R3, 0.0F, -1.0036F, 0.0F);
        this.leg3R3.cubeList.add(new ModelBox(leg3R3, 22, 49, -3.0F, 0.4F, -0.5F, 3, 0, 1, 0.0F, false));
        this.leg3R3.cubeList.add(new ModelBox(leg3R3, 11, 92, -3.0F, 0.6F, -2.5F, 3, 0, 2, 0.0F, false));

        this.leg4R = new ModelRenderer(this);
        this.leg4R.setRotationPoint(-2.0F, 0.0F, -2.5F);
        this.body.addChild(leg4R);
        this.setRotateAngle(leg4R, 0.0F, 0.1309F, 0.0F);


        this.leg4R2 = new ModelRenderer(this);
        this.leg4R2.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.leg4R.addChild(leg4R2);
        this.setRotateAngle(leg4R2, 0.0F, -0.3491F, 0.0F);


        this.leg4R3 = new ModelRenderer(this);
        this.leg4R3.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.leg4R2.addChild(leg4R3);
        this.setRotateAngle(leg4R3, 0.0F, -0.3491F, 0.0F);
        this.leg4R3.cubeList.add(new ModelBox(leg4R3, 22, 34, -3.0F, 0.4F, -0.5F, 3, 0, 1, 0.0F, false));
        this.leg4R3.cubeList.add(new ModelBox(leg4R3, 20, 40, -3.0F, 0.5F, -2.5F, 3, 0, 2, 0.0F, false));

        this.leg5R = new ModelRenderer(this);
        this.leg5R.setRotationPoint(-4.0F, -0.1F, -1.0F);
        this.body.addChild(leg5R);
        this.setRotateAngle(leg5R, 0.0F, 0.48F, 0.0F);
        this.leg5R.cubeList.add(new ModelBox(leg5R, 10, 46, -6.0F, 1.0F, -1.0F, 6, 0, 2, 0.0F, false));

        this.leg5R2 = new ModelRenderer(this);
        this.leg5R2.setRotationPoint(-9.0F, 0.0F, -1.0F);
        this.leg5R.addChild(leg5R2);
        this.setRotateAngle(leg5R2, 0.0F, 0.2618F, 0.0F);
        this.leg5R2.cubeList.add(new ModelBox(leg5R2, 0, 61, -4.0F, 1.001F, -1.0F, 4, 0, 3, 0.0F, false));

        this.leg5R3 = new ModelRenderer(this);
        this.leg5R3.setRotationPoint(-4.0F, 0.0F, 4.0F);
        this.leg5R2.addChild(leg5R3);
        this.setRotateAngle(leg5R3, 0.0F, 1.3963F, 0.0F);
        this.leg5R3.cubeList.add(new ModelBox(leg5R3, 15, 57, -4.0F, 1.0F, -1.0F, 4, 0, 3, 0.0F, false));
        this.leg5R3.cubeList.add(new ModelBox(leg5R3, 11, 57, -5.0F, 1.0F, 0.0F, 1, 0, 2, 0.0F, false));

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
