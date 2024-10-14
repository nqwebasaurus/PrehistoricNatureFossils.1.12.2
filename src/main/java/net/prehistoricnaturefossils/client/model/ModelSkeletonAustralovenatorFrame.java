package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonAustralovenatorFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer Leftleg1;
    private final ModelRenderer Leftleg2;
    private final ModelRenderer Leftleg3;
    private final ModelRenderer Leftleg4;
    private final ModelRenderer Leftleg5;
    private final ModelRenderer Rightleg1;
    private final ModelRenderer Rightleg2;
    private final ModelRenderer Rightleg3;
    private final ModelRenderer Rightleg4;
    private final ModelRenderer Rightleg5;
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer Leftarm1;
    private final ModelRenderer Leftarm2;
    private final ModelRenderer Leftarm3;
    private final ModelRenderer Leftarm4;
    private final ModelRenderer Rightarm1;
    private final ModelRenderer Rightarm2;
    private final ModelRenderer Rightarm3;
    private final ModelRenderer Rightarm4;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r10;
    private final ModelRenderer head;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer tail6;

    public ModelSkeletonAustralovenatorFrame() {
        this.textureWidth = 85;
        this.textureHeight = 85;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -22.0F, -1.0F, 1, 22, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(1.6F, -18.0F, -19.8F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.0873F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.5F, -5.0F, -0.5F, 1, 23, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(1.6F, -18.0F, -19.8F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0873F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -0.9F, -4.0F, -0.5F, 1, 8, 1, -0.16F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -18.0F, -0.5F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 3.8F, -5.0F, -0.5F, 1, 10, 1, -0.16F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -23.0F, 0.0F);
        this.fossil.addChild(hips);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.9F, -4.2F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0524F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 30, 12, -0.5F, 0.9F, -0.1F, 1, 2, 8, 0.006F, false));

        this.Leftleg1 = new ModelRenderer(this);
        this.Leftleg1.setRotationPoint(4.4F, 0.5084F, -0.6257F);
        this.hips.addChild(Leftleg1);
        this.setRotateAngle(Leftleg1, -0.654F, 0.0266F, 0.0346F);


        this.Leftleg2 = new ModelRenderer(this);
        this.Leftleg2.setRotationPoint(-0.3F, 9.4129F, 0.4154F);
        this.Leftleg1.addChild(Leftleg2);
        this.setRotateAngle(Leftleg2, 0.925F, 0.0F, 0.0F);


        this.Leftleg3 = new ModelRenderer(this);
        this.Leftleg3.setRotationPoint(-0.4F, 9.1191F, 0.371F);
        this.Leftleg2.addChild(Leftleg3);
        this.setRotateAngle(Leftleg3, -0.5228F, -0.0784F, -0.0464F);


        this.Leftleg4 = new ModelRenderer(this);
        this.Leftleg4.setRotationPoint(0.9F, 5.2125F, 0.0756F);
        this.Leftleg3.addChild(Leftleg4);
        this.setRotateAngle(Leftleg4, 0.2618F, 0.0F, 0.0F);


        this.Leftleg5 = new ModelRenderer(this);
        this.Leftleg5.setRotationPoint(0.0F, -0.0248F, -3.0271F);
        this.Leftleg4.addChild(Leftleg5);


        this.Rightleg1 = new ModelRenderer(this);
        this.Rightleg1.setRotationPoint(-4.4F, 0.5084F, -0.6257F);
        this.hips.addChild(Rightleg1);
        this.setRotateAngle(Rightleg1, 0.0F, 0.0F, -0.1745F);


        this.Rightleg2 = new ModelRenderer(this);
        this.Rightleg2.setRotationPoint(0.3F, 9.4129F, 0.4154F);
        this.Rightleg1.addChild(Rightleg2);
        this.setRotateAngle(Rightleg2, 0.8814F, 0.0F, 0.0F);


        this.Rightleg3 = new ModelRenderer(this);
        this.Rightleg3.setRotationPoint(0.4F, 9.1191F, 0.371F);
        this.Rightleg2.addChild(Rightleg3);
        this.setRotateAngle(Rightleg3, -0.8651F, 0.1334F, 0.1129F);


        this.Rightleg4 = new ModelRenderer(this);
        this.Rightleg4.setRotationPoint(-0.9F, 5.2125F, 0.0756F);
        this.Rightleg3.addChild(Rightleg4);
        this.setRotateAngle(Rightleg4, 0.48F, 0.0F, 0.0F);


        this.Rightleg5 = new ModelRenderer(this);
        this.Rightleg5.setRotationPoint(0.0F, -0.0248F, -3.0271F);
        this.Rightleg4.addChild(Rightleg5);
        this.setRotateAngle(Rightleg5, -0.2618F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, -4.2F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0F, -0.0873F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, -0.8F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0175F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -0.5F, 0.0F, -11.2F, 1, 2, 12, 0.0F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.2F, -11.9F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, -0.0436F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.9F, 0.2F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1396F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 43, 10, -0.5F, 0.9022F, -4.2394F, 1, 2, 4, 0.006F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -0.9F, 0.2F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1396F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 66, 66, 0.0F, 0.6022F, -6.9394F, 1, 1, 3, -0.15F, false));

        this.Leftarm1 = new ModelRenderer(this);
        this.Leftarm1.setRotationPoint(3.7F, 5.8084F, -3.8257F);
        this.chest.addChild(Leftarm1);
        this.setRotateAngle(Leftarm1, 0.682F, 0.2264F, -0.1688F);


        this.Leftarm2 = new ModelRenderer(this);
        this.Leftarm2.setRotationPoint(0.2789F, 4.8602F, 0.3544F);
        this.Leftarm1.addChild(Leftarm2);
        this.setRotateAngle(Leftarm2, -1.8447F, -0.2947F, 0.0814F);


        this.Leftarm3 = new ModelRenderer(this);
        this.Leftarm3.setRotationPoint(0.6F, 4.5852F, -0.6812F);
        this.Leftarm2.addChild(Leftarm3);
        this.setRotateAngle(Leftarm3, 0.0F, 0.0F, 0.2182F);


        this.Leftarm4 = new ModelRenderer(this);
        this.Leftarm4.setRotationPoint(-1.2864F, -0.2951F, -0.263F);
        this.Leftarm3.addChild(Leftarm4);
        this.setRotateAngle(Leftarm4, -0.1745F, 0.0F, 0.0F);


        this.Rightarm1 = new ModelRenderer(this);
        this.Rightarm1.setRotationPoint(-3.7F, 5.8084F, -3.8257F);
        this.chest.addChild(Rightarm1);
        this.setRotateAngle(Rightarm1, -0.5397F, -0.2264F, 0.1688F);


        this.Rightarm2 = new ModelRenderer(this);
        this.Rightarm2.setRotationPoint(-0.2789F, 4.8602F, 0.3544F);
        this.Rightarm1.addChild(Rightarm2);
        this.setRotateAngle(Rightarm2, -1.2246F, 0.3442F, 0.2034F);


        this.Rightarm3 = new ModelRenderer(this);
        this.Rightarm3.setRotationPoint(-0.6F, 4.5852F, -0.6812F);
        this.Rightarm2.addChild(Rightarm3);
        this.setRotateAngle(Rightarm3, -0.4181F, -0.5926F, 0.2106F);


        this.Rightarm4 = new ModelRenderer(this);
        this.Rightarm4.setRotationPoint(1.2864F, -0.2951F, -0.263F);
        this.Rightarm3.addChild(Rightarm4);
        this.setRotateAngle(Rightarm4, -0.2618F, 0.0F, 0.0F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.5F, -5.9F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, 0.0F, 0.1309F, -0.1745F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -0.6F, -2.8F);
        this.neck3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3491F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 62, 51, 0.0F, -0.2F, 0.0F, 1, 1, 3, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.1F, -2.6F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, 0.1104F, -0.2684F, -0.0909F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -3.6F, -4.7F);
        this.neck2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.576F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 43, -0.1F, 0.8F, 0.4F, 1, 1, 6, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -3.1F, -4.6F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.0641F, -0.4891F, 0.3979F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 0.6F, -3.0F);
        this.neck.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0349F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 53, 62, 0.0F, -0.2F, -0.2F, 1, 1, 3, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.2F, -3.0F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.1309F, 0.0F, 0.0F);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(1.0F, -0.7F, -3.2F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-1.0F, -0.7F, -3.2F);
        this.head.addChild(rightFace);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.1F, 0.9F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.7854F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.5F, 3.5F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.0939F, -0.1389F, -0.0739F);
        this.tail.cubeList.add(new ModelBox(tail, 34, 23, -0.5F, -0.1F, 0.1F, 1, 2, 7, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.7F, 7.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0542F, 0.2614F, 0.014F);
        this.tail2.cubeList.add(new ModelBox(tail2, 21, 27, -0.5F, 0.6F, 0.0F, 1, 2, 8, 0.006F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 7.9F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0723F, 0.2611F, 0.0187F);
        this.tail3.cubeList.add(new ModelBox(tail3, 17, 15, -0.5F, 0.4F, -0.2F, 1, 1, 10, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0928F, -0.3477F, 0.0317F);
        this.tail4.cubeList.add(new ModelBox(tail4, 30, 0, -0.5F, 0.4F, -0.4F, 1, 1, 8, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1084F, -0.2603F, 0.028F);
        this.tail5.cubeList.add(new ModelBox(tail5, 17, 0, -0.5F, 0.4F, -0.7F, 1, 1, 10, -0.15F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.1965F, -0.2141F, 0.0423F);
        this.tail6.cubeList.add(new ModelBox(tail6, 0, 25, -0.5F, 0.4F, -0.8F, 1, 1, 9, -0.15F, false));

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
