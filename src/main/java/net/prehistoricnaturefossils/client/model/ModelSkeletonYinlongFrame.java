package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonYinlongFrame extends ModelBase {
    private final ModelRenderer body;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer tail2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer tail3;
    private final ModelRenderer cube_r6;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer leftleg;
    private final ModelRenderer leftleg2;
    private final ModelRenderer leftleg3;
    private final ModelRenderer leftleg4;
    private final ModelRenderer rightleg;
    private final ModelRenderer rightleg2;
    private final ModelRenderer rightleg3;
    private final ModelRenderer rightleg4;
    private final ModelRenderer upperbody2;
    private final ModelRenderer cube_r7;
    private final ModelRenderer upperbody;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer leftarm;
    private final ModelRenderer leftarm2;
    private final ModelRenderer leftarm3;
    private final ModelRenderer rightarm;
    private final ModelRenderer rightarm2;
    private final ModelRenderer rightarm3;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer head;
    private final ModelRenderer jaw;

    public ModelSkeletonYinlongFrame() {
        this.textureWidth = 53;
        this.textureHeight = 53;

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 10.5F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 1, 1, -0.525F, 0.5F, -1.075F, 1, 13, 1, -0.03F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(2.7F, 0.0F, -11.875F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.4398F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 0.025F, 1.5F, -0.2F, 1, 12, 1, -0.03F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(2.675F, 1.0F, -11.575F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.658F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 2.325F, -2.5F, -0.5F, 1, 4, 1, -0.03F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.025F, 1.0F, -0.575F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 0.325F, -3.5F, -0.5F, 1, 6, 1, -0.03F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.1F, -0.25F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2182F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 21, 13, -0.5F, 1.4F, -1.15F, 1, 1, 5, -0.03F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.4467F, 2.8792F);
        this.body.addChild(tail2);
        this.setRotateAngle(tail2, -0.0901F, 0.1693F, -0.0437F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0584F, 0.4039F);
        this.tail2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 18, -0.5F, 0.5F, -0.5F, 1, 1, 6, -0.03F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.2584F, 5.7039F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0411F, 0.1692F, 0.0448F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.0078F, 0.0562F);
        this.tail3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 11, 15, -0.5F, 0.5F, 0.0F, 1, 1, 6, -0.03F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.5078F, 5.2562F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1701F, 0.225F, 0.001F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -0.5F, 0.6208F, -0.0202F, 1, 1, 7, -0.03F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.1208F, 6.9798F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1318F, 0.3907F, -0.0213F);
        this.tail5.cubeList.add(new ModelBox(tail5, 11, 7, -0.5F, 0.5043F, -0.0653F, 1, 1, 6, -0.03F, false));

        this.leftleg = new ModelRenderer(this);
        this.leftleg.setRotationPoint(2.5F, 1.8435F, -0.5191F);
        this.body.addChild(leftleg);
        this.setRotateAngle(leftleg, -0.0437F, -0.0436F, 0.0019F);


        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(0.5F, 4.6698F, -0.7141F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.6981F, 0.0F, 0.0F);


        this.leftleg3 = new ModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 4.1127F, 1.4494F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.48F, 0.0F, 0.0F);


        this.leftleg4 = new ModelRenderer(this);
        this.leftleg4.setRotationPoint(-0.5F, 3.538F, -0.7986F);
        this.leftleg3.addChild(leftleg4);
        this.setRotateAngle(leftleg4, -0.1745F, 0.0F, 0.0F);


        this.rightleg = new ModelRenderer(this);
        this.rightleg.setRotationPoint(-2.5F, 1.8435F, -0.5191F);
        this.body.addChild(rightleg);
        this.setRotateAngle(rightleg, -0.5677F, -0.0368F, 0.0235F);


        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(-0.5F, 4.6698F, -0.7141F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.6109F, 0.0F, 0.0F);


        this.rightleg3 = new ModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, 4.1127F, 1.4494F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.3927F, 0.0F, 0.0F);


        this.rightleg4 = new ModelRenderer(this);
        this.rightleg4.setRotationPoint(0.5F, 3.538F, -0.7986F);
        this.rightleg3.addChild(rightleg4);
        this.setRotateAngle(rightleg4, 0.3491F, 0.0F, 0.0F);


        this.upperbody2 = new ModelRenderer(this);
        this.upperbody2.setRotationPoint(0.0F, -0.6473F, -1.3713F);
        this.body.addChild(upperbody2);
        this.setRotateAngle(upperbody2, -0.0003F, -0.2185F, 0.0077F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.4276F, -7.0322F);
        this.upperbody2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0087F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 9, -0.5F, 0.2255F, -0.0038F, 1, 1, 7, -0.03F, false));

        this.upperbody = new ModelRenderer(this);
        this.upperbody.setRotationPoint(0.0F, 0.0133F, -7.001F);
        this.upperbody2.addChild(upperbody);
        this.setRotateAngle(upperbody, -0.045F, -0.2615F, 0.0154F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 0.2692F, -1.7846F);
        this.upperbody.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1396F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 36, 41, -1.0F, 0.6779F, -0.1399F, 1, 1, 2, -0.03F, false));

        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 2.0025F, -5.3153F);
        this.upperbody.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.4363F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 31, 9, -1.0F, 0.5991F, 0.0925F, 1, 1, 4, -0.03F, false));

        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(2.1F, 4.409F, -3.0776F);
        this.upperbody.addChild(leftarm);
        this.setRotateAngle(leftarm, -0.7366F, 0.5095F, -0.3524F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(-0.2142F, -0.3131F, 3.9766F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -0.2618F, 0.0F, 0.0F);


        this.leftarm3 = new ModelRenderer(this);
        this.leftarm3.setRotationPoint(0.5F, 2.9715F, -0.2819F);
        this.leftarm2.addChild(leftarm3);
        this.setRotateAngle(leftarm3, 0.0F, 0.0F, 0.6545F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-2.1F, 4.409F, -3.0776F);
        this.upperbody.addChild(rightarm);
        this.setRotateAngle(rightarm, -0.583F, -0.3439F, 0.1332F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(0.2142F, -0.3131F, 3.9766F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, 0.0422F, 0.0368F, -0.0791F);


        this.rightarm3 = new ModelRenderer(this);
        this.rightarm3.setRotationPoint(-0.5F, 2.9715F, -0.2819F);
        this.rightarm2.addChild(rightarm3);
        this.setRotateAngle(rightarm3, 0.0F, 0.0F, -0.6545F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 1.609F, -4.7276F);
        this.upperbody.addChild(neck);
        this.setRotateAngle(neck, -0.4513F, -0.4261F, -0.0571F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 1.4898F, -1.1193F);
        this.neck.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.4712F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 9, 42, 0.0F, -0.1128F, -0.3038F, 1, 1, 2, -0.03F, false));

        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 1.7338F, -2.9087F);
        this.neck.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1745F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 44, 13, 0.0F, 0.0F, -0.2F, 1, 1, 2, -0.03F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 1.1338F, -2.5087F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 1.0021F, -0.1843F, -0.1533F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.4305F, -0.0504F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.1745F, 0.0F, 0.0F);

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
