package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonAquilopsFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer leftleg;
    private final ModelRenderer leftleg2;
    private final ModelRenderer leftleg3;
    private final ModelRenderer leftleg4;
    private final ModelRenderer rightleg;
    private final ModelRenderer rightleg2;
    private final ModelRenderer rightleg3;
    private final ModelRenderer rightleg4;
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer leftarm;
    private final ModelRenderer leftarm2;
    private final ModelRenderer leftarm3;
    private final ModelRenderer rightarm;
    private final ModelRenderer rightarm2;
    private final ModelRenderer rightarm3;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r11;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;

    public ModelSkeletonAquilopsFrame() {
        this.textureWidth = 70;
        this.textureHeight = 70;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 5.0F, -3.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, 0.0F, 0.0F, 1, 19, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.45F, 8.15F, -10.8F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.1396F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.45F, -5.15F, -0.5F, 1, 16, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.45F, 8.15F, -10.8F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1396F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 0.85F, -2.25F, -0.5F, 1, 5, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 5.5F, 0.5F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 5.0F, -3.5F, -0.5F, 1, 6, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, 0.0873F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -1.8F, -2.8F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1222F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 11, 2, -1.0F, 0.7F, 0.0F, 1, 1, 8, -0.15F, false));

        this.leftleg = new ModelRenderer(this);
        this.leftleg.setRotationPoint(2.5F, 0.2435F, 0.4809F);
        this.hips.addChild(leftleg);
        this.setRotateAngle(leftleg, -0.9599F, 0.0F, 0.0F);


        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0F, 7.6698F, 0.3859F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 1.3526F, 0.0F, 0.0F);


        this.leftleg3 = new ModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 10.1127F, 0.6494F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.8901F, 0.0F, 0.0F);


        this.leftleg4 = new ModelRenderer(this);
        this.leftleg4.setRotationPoint(-0.5F, 4.538F, -0.7986F);
        this.leftleg3.addChild(leftleg4);
        this.setRotateAngle(leftleg4, 0.3927F, 0.0F, 0.0F);


        this.rightleg = new ModelRenderer(this);
        this.rightleg.setRotationPoint(-2.5F, 0.2435F, 0.4809F);
        this.hips.addChild(rightleg);
        this.setRotateAngle(rightleg, -0.2182F, 0.0F, 0.0F);


        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(0.0F, 7.6698F, 0.3859F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 1.0472F, 0.0F, 0.0F);


        this.rightleg3 = new ModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, 10.1127F, 0.6494F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.9338F, 0.0F, 0.0F);


        this.rightleg4 = new ModelRenderer(this);
        this.rightleg4.setRotationPoint(0.5F, 4.538F, -0.7986F);
        this.rightleg3.addChild(rightleg4);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.3F, -3.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0873F, -0.0435F, -0.0038F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -0.6F, -2.6F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2007F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 4, 42, -1.0F, 0.786F, -3.3763F, 1, 1, 4, -0.15F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0436F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 42, 20, -1.0F, 0.2F, -2.6F, 1, 1, 3, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 1.1F, -6.6F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, -0.0873F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 1.8F, -2.2F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.5061F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 22, 33, -1.0F, -0.2916F, -0.0313F, 1, 1, 4, -0.15F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 2.5F, -4.0F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.369F, -0.114F, -0.044F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 4, 53, -0.8F, -0.3F, -0.6F, 1, 1, 3, -0.15F, false));

        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(2.7F, 4.375F, -2.05F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, -1.4193F, 0.2409F, -0.1896F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(-0.2691F, 0.6088F, 5.9708F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, 0.3487F, 0.0057F, -0.1308F);


        this.leftarm3 = new ModelRenderer(this);
        this.leftarm3.setRotationPoint(0.2F, 3.7715F, -0.2819F);
        this.leftarm2.addChild(leftarm3);
        this.setRotateAngle(leftarm3, 0.0F, 0.0F, 0.7418F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-2.7F, 4.375F, -2.05F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, -1.2011F, -0.2409F, 0.1896F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(0.2691F, 0.6088F, 5.9708F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, 0.4702F, 0.1001F, -0.1942F);


        this.rightarm3 = new ModelRenderer(this);
        this.rightarm3.setRotationPoint(-0.2F, 3.7715F, -0.2819F);
        this.rightarm2.addChild(rightarm3);
        this.setRotateAngle(rightarm3, 0.0F, 0.0F, -0.4363F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 2.0F, -3.9F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, 0.2956F, -0.5093F, -0.0849F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 0.0F, -3.0F);
        this.neck3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1745F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 25, 44, -1.0F, -0.2F, -0.3F, 1, 1, 3, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.3F, -2.7F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.1304F, 0.1013F, 0.2148F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -1.8F, -1.2F);
        this.neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.7505F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 53, 7, -0.5F, 0.6F, -0.3F, 1, 1, 3, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.6F, -1.3F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.6109F, 0.0F, 0.0F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.2729F, -0.6706F);
        this.neck.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2618F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 22, 54, -0.5F, 0.5F, -1.1F, 1, 1, 2, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.6F, -0.7F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.1745F, 0.0436F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.7F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.6021F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.4F, 5.1F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.0089F, 0.2182F, -0.0019F);
        this.tail.cubeList.add(new ModelBox(tail, 16, 21, -0.5F, 0.3F, -0.5F, 1, 1, 7, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 5.9F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0323F, 0.3024F, -0.0434F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 0, -0.5F, 0.2F, 0.0F, 1, 1, 8, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.3208F, 0.3024F, -0.0439F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 20, -0.5F, 0.1F, -0.2F, 1, 1, 7, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0679F, 0.2974F, 0.0708F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 10, -0.5F, 0.1F, -0.5F, 1, 1, 8, -0.15F, false));

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
