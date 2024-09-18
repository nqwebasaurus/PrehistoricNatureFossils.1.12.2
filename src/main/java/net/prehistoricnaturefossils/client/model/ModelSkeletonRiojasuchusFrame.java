package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonRiojasuchusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer hip;
    private final ModelRenderer cube_r2;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftLeg4;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer body;
    private final ModelRenderer cube_r3;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r4;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer neck;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;

    public ModelSkeletonRiojasuchusFrame() {
        this.textureWidth = 60;
        this.textureHeight = 60;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -10.0F, 1.0F, 1, 10, 1, -0.16F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.6F, -12.0F, -11.3F, 1, 12, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -10.0F, -10.8F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.6F, -3.0F, -0.5F, 1, 5, 1, -0.15F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -1.0F, -3.0F, 11.8F, 1, 5, 1, -0.15F, false));

        this.hip = new ModelRenderer(this);
        this.hip.setRotationPoint(0.0F, -9.7F, 1.5F);
        this.fossil.addChild(hip);
        this.setRotateAngle(hip, -0.1745F, 0.0F, 0.0F);


        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -1.5F, -1.4F);
        this.hip.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1222F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 23, 10, -1.0F, 0.4F, 0.0F, 1, 1, 5, -0.15F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(2.0F, -0.0943F, 0.063F);
        this.hip.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.2182F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.5F, 5.0F, 0.3F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.9599F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 4.7152F, 0.0765F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.3927F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 0.3F, -2.0F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, -0.3927F, 0.0F, 0.0F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-2.0F, -0.0943F, 0.063F);
        this.hip.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.9638F, 0.0857F, -0.0467F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.5F, 5.0F, 0.3F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.7017F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 4.7152F, 0.0765F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.2182F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 0.3F, -2.0F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.3491F, 0.0F, 0.0F);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.3F, -1.7F);
        this.hip.addChild(body);
        this.setRotateAngle(body, -0.0873F, 0.0435F, -0.0038F);


        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 0.3F, -0.3F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0524F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 9, 15, -1.0F, -0.1F, -5.2F, 1, 1, 6, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.3F, -5.8F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, -0.0873F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.4F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1571F, 0.0F, 0.0008F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 18, 17, -0.5F, 0.2F, -5.8F, 1, 1, 6, -0.15F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(2.5F, 3.9316F, -4.6486F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, -0.436F, 0.1183F, -0.3146F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 0.2F, 4.4F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.5922F, -0.5523F, 0.2859F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 3.7F, 0.5F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 2.4958F, 0.0F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-2.5F, 3.9316F, -4.6486F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, -0.2248F, -0.3029F, 0.2692F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 0.2F, 4.4F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.4877F, 0.4938F, 0.009F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 3.7F, 0.5F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 2.4086F, 0.0F, 0.0F);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.9F, -4.8F);
        this.chest.addChild(neck2);
        this.setRotateAngle(neck2, -0.1242F, -0.1244F, 0.0589F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.1F, -0.7F);
        this.neck2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 18, 31, -0.5F, 0.2F, -3.3F, 1, 1, 4, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.5F, -3.9F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.0381F, -0.1271F, -0.0918F);
        this.neck.cubeList.add(new ModelBox(neck, 19, 39, -0.5F, 0.2F, -2.6F, 1, 1, 3, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.1F, -2.6F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.011F, -0.4618F, -0.2149F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.9F, 1.5F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 1.1157F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.6F, 3.4F);
        this.hip.addChild(tail);
        this.setRotateAngle(tail, -0.3057F, -0.0416F, 0.0131F);
        this.tail.cubeList.add(new ModelBox(tail, 31, 9, -0.5F, 0.1F, -0.1F, 1, 1, 4, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.5F, 4.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1986F, -0.2569F, 0.0511F);
        this.tail2.cubeList.add(new ModelBox(tail2, 8, 23, -0.5F, 0.6F, -0.1F, 1, 1, 5, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 1.0F, 5.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.2706F, -0.2527F, -0.0692F);
        this.tail3.cubeList.add(new ModelBox(tail3, 5, 28, -0.5F, -0.4F, -0.4F, 1, 1, 5, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.2568F, -0.1689F, -0.0441F);
        this.tail4.cubeList.add(new ModelBox(tail4, 30, 3, -0.5F, -0.3F, 0.2F, 1, 1, 4, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.318F, 0.1347F, -0.03F);
        this.tail5.cubeList.add(new ModelBox(tail5, 13, 7, -0.5F, -0.3F, -0.3F, 1, 1, 6, -0.15F, false));

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
