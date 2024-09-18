package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonEuropeltaFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer leftleg;
    private final ModelRenderer leftleg2;
    private final ModelRenderer leftleg3;
    private final ModelRenderer leftfoot;
    private final ModelRenderer leftfoot2;
    private final ModelRenderer rightleg;
    private final ModelRenderer rightleg2;
    private final ModelRenderer rightleg3;
    private final ModelRenderer rightfoot;
    private final ModelRenderer rightfoot2;
    private final ModelRenderer body;
    private final ModelRenderer cube_r4;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer leftarm;
    private final ModelRenderer leftarm2;
    private final ModelRenderer lefthand;
    private final ModelRenderer rightarm;
    private final ModelRenderer rightarm2;
    private final ModelRenderer righthand;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r7;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r8;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r9;
    private final ModelRenderer head;
    private final ModelRenderer bone;
    private final ModelRenderer leftFace;
    private final ModelRenderer rightFace;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r10;
    private final ModelRenderer tail5;

    public ModelSkeletonEuropeltaFrame() {
        this.textureWidth = 106;
        this.textureHeight = 106;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -18.0F, 5.0F, 1, 18, 1, -0.15F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -1.8F, -18.0F, -15.0F, 1, 18, 1, -0.15F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -16.0F, -14.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 2.5F, -5.0F, -0.5F, 1, 12, 1, -0.16F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -2.0F, -7.0F, 19.5F, 1, 13, 1, -0.16F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -19.1F, 6.0F);
        this.fossil.addChild(hips);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -0.6F, -3.5F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2618F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, -1, 49, 0.0F, 0.5199F, -0.1166F, 1, 1, 8, -0.2F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -1.0F, -8.3F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 29, 0.0F, 0.5F, 0.0F, 1, 1, 5, -0.2F, false));

        this.leftleg = new ModelRenderer(this);
        this.leftleg.setRotationPoint(5.4F, 1.1999F, -0.2448F);
        this.hips.addChild(leftleg);
        this.setRotateAngle(leftleg, 0.2094F, 0.0F, 0.0F);


        this.leftleg2 = new ModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0F, 8.1762F, -2.8099F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.0611F, 0.0F, 0.0F);


        this.leftleg3 = new ModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 6.5865F, 3.4725F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.2269F, 0.0F, 0.0F);


        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0F, 2.5542F, -0.7405F);
        this.leftleg3.addChild(leftfoot);
        this.setRotateAngle(leftfoot, -0.0175F, 0.0F, 0.0F);


        this.leftfoot2 = new ModelRenderer(this);
        this.leftfoot2.setRotationPoint(0.0F, 0.939F, -0.2934F);
        this.leftfoot.addChild(leftfoot2);
        this.setRotateAngle(leftfoot2, -0.0175F, 0.0F, 0.0F);


        this.rightleg = new ModelRenderer(this);
        this.rightleg.setRotationPoint(-5.4F, 1.1999F, -0.2448F);
        this.hips.addChild(rightleg);
        this.setRotateAngle(rightleg, -0.4014F, 0.0F, 0.0F);


        this.rightleg2 = new ModelRenderer(this);
        this.rightleg2.setRotationPoint(0.0F, 8.1762F, -2.8099F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.1484F, 0.0F, 0.0F);


        this.rightleg3 = new ModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, 6.5865F, 3.4725F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, 0.3403F, 0.0F, 0.0F);


        this.rightfoot = new ModelRenderer(this);
        this.rightfoot.setRotationPoint(0.0F, 2.5542F, -0.7405F);
        this.rightleg3.addChild(rightfoot);
        this.setRotateAngle(rightfoot, -0.0175F, 0.0F, 0.0F);


        this.rightfoot2 = new ModelRenderer(this);
        this.rightfoot2.setRotationPoint(0.0F, 0.939F, -0.2934F);
        this.rightfoot.addChild(rightfoot2);
        this.setRotateAngle(rightfoot2, 0.0698F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.7F, -8.3F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0F, 0.0873F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -0.3F, 0.3F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 40, 10, 0.0F, 0.4F, -8.0F, 1, 1, 8, -0.2F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.7F, -8.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, 0.0436F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 0.6F, -4.7F);
        this.chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2793F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 55, 76, -0.1F, 0.4651F, -3.0774F, 1, 1, 3, -0.2F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, 0.0F, 0.3F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.192F, 0.0175F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 61, 7, 0.0F, 0.1F, -5.5F, 1, 1, 6, -0.2F, false));

        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(5.3F, 5.5669F, -3.5334F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, 0.5149F, -0.0008F, -0.2182F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(-0.6479F, 5.3571F, 1.7001F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -0.55F, -0.9424F, 1.0623F);


        this.lefthand = new ModelRenderer(this);
        this.lefthand.setRotationPoint(0.1439F, 6.5086F, -2.6347F);
        this.leftarm2.addChild(lefthand);
        this.setRotateAngle(lefthand, 0.9395F, 0.7562F, -0.2091F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-5.3F, 5.3669F, -3.5334F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, -0.7451F, 0.0454F, 0.1941F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(0.6479F, 5.3571F, 1.7001F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, 1.0233F, 1.1447F, 0.2858F);


        this.righthand = new ModelRenderer(this);
        this.righthand.setRotationPoint(-0.1439F, 6.5086F, -2.6347F);
        this.rightarm2.addChild(righthand);
        this.setRotateAngle(righthand, 0.9309F, -0.6437F, 0.5477F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 2.0F, -7.7F);
        this.chest.addChild(neck3);
        this.setRotateAngle(neck3, 0.1309F, 0.0F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.neck3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 70, 38, -0.1F, -0.1F, -4.3F, 1, 1, 5, -0.2F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -3.7F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, 0.1745F, 0.2618F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 0.0F, -0.3F);
        this.neck2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3927F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 9, 70, 0.0F, 0.0F, -3.6F, 1, 1, 4, -0.2F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.4F, -3.5F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.0F, 0.1745F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -0.8F, -2.9F);
        this.neck.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1222F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 78, 0.0F, 0.5F, 0.2F, 1, 1, 3, -0.2F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.1742F, -2.7931F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.4115F, 0.08F, 0.0349F);


        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(1.1764F, -0.524F, -1.7014F);
        this.head.addChild(bone);


        this.leftFace = new ModelRenderer(this);
        this.leftFace.setRotationPoint(0.5F, 0.2594F, -5.524F);
        this.head.addChild(leftFace);


        this.rightFace = new ModelRenderer(this);
        this.rightFace.setRotationPoint(-0.5F, 0.2594F, -5.524F);
        this.head.addChild(rightFace);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.3F, 1.3117F, 0.2096F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.2705F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 1.7F, 3.1F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.2961F, -0.0014F, 0.0248F);
        this.tail.cubeList.add(new ModelBox(tail, 27, 50, -0.5F, 0.0F, 0.5F, 1, 1, 7, -0.2F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0204F, -0.3459F, -0.0676F);
        this.tail2.cubeList.add(new ModelBox(tail2, 40, 0, -0.5F, 0.0F, 0.0F, 1, 1, 8, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 7.9F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0925F, 0.2444F, -0.1618F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 29, -0.5F, 0.0F, -0.4F, 1, 1, 9, -0.2F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0021F, 0.2033F, 0.0126F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, -0.6F);
        this.tail4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.003F, -0.0171F, -0.002F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 23, 58, -0.4F, 0.0F, -0.2F, 1, 1, 7, -0.2F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.3024F, 0.0122F, -0.0223F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 40, -0.5F, -0.1F, -0.1F, 1, 1, 8, -0.2F, false));

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
