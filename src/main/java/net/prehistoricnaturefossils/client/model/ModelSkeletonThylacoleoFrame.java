package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonThylacoleoFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftLeg4;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer body2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer body;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r8;
    private final ModelRenderer leftarm;
    private final ModelRenderer leftarm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer leftArm4;
    private final ModelRenderer leftThumb;
    private final ModelRenderer rightarm;
    private final ModelRenderer rightarm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer rightArm4;
    private final ModelRenderer rightThumb;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r10;
    private final ModelRenderer head;
    private final ModelRenderer leftZygomaticarch;
    private final ModelRenderer rightZygomaticarch;
    private final ModelRenderer jaw;
    private final ModelRenderer tail;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;

    public ModelSkeletonThylacoleoFrame() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 21.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -18.0F, 9.3F, 1, 18, 1, -0.16F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -14.0F, 9.3F, 1, 18, 1, -0.165F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -18.5F, -11.6F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2094F, 0.0F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 0.5F, -3.5F, -0.5F, 1, 10, 1, -0.15F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -18.5F, -11.6F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.2094F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 1.5F, 0.5F, -0.5F, 1, 22, 1, -0.165F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 1.5F, -3.5F, -0.5F, 1, 22, 1, -0.16F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -17.5F, 9.8F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 0.2F, -5.5F, -0.5F, 1, 10, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -18.0F, 10.0F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.2182F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.0F, -3.0F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.192F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -0.5F, 0.6F, 0.1F, 1, 1, 7, -0.15F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(4.1F, 0.3F, -0.1F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.2486F, -0.0525F, -0.0008F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 9.8769F, 0.6997F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.3426F, -0.029F, -0.0164F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.5F, 9.6737F, -0.8446F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.6768F, -0.1763F, 0.0914F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.1F, 3.0414F, -0.8063F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.968F, -0.0051F, -0.0055F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-4.1F, 0.3F, -0.1F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.1396F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 9.8769F, 0.6997F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.0821F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.5F, 9.6737F, -0.8446F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -1.0036F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(-0.1F, 3.0414F, -0.8063F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.2705F, 0.0F, 0.0F);


        this.body2 = new ModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.5F, -3.4F);
        this.hips.addChild(body2);
        this.setRotateAngle(body2, 0.0F, -0.0436F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -1.0F, -5.5F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1047F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 11, 12, -1.0F, 0.5F, 0.3F, 1, 1, 6, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.5F, -5.5F);
        this.body2.addChild(body);
        this.setRotateAngle(body, -0.22F, -0.1278F, 0.0285F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 0.2F, -4.5F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2793F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 19, 29, -1.0F, 0.6976F, -3.726F, 1, 1, 5, -0.15F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 0.0F, -0.5F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1571F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 33, 0, -1.0F, 0.1F, -2.9F, 1, 1, 4, -0.15F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 1.8F, -8.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.1308F, -0.001F, -0.0018F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.2F, 0.6F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.4014F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 9, -0.5F, 0.1F, -7.4F, 1, 1, 7, -0.15F, false));

        this.leftarm = new ModelRenderer(this);
        this.leftarm.setRotationPoint(4.6F, 4.8651F, -3.3441F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, -0.0514F, 0.3248F, -0.8232F);


        this.leftarm2 = new ModelRenderer(this);
        this.leftarm2.setRotationPoint(0.1616F, 6.5389F, 4.1847F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -1.3038F, -0.4835F, 1.2786F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 9.0551F, -3.5341F);
        this.leftarm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, -0.2304F, -0.3446F, 0.5369F);


        this.leftArm4 = new ModelRenderer(this);
        this.leftArm4.setRotationPoint(0.3F, 1.4605F, -0.0824F);
        this.leftArm3.addChild(leftArm4);
        this.setRotateAngle(leftArm4, 0.6969F, 0.0337F, 0.0294F);


        this.leftThumb = new ModelRenderer(this);
        this.leftThumb.setRotationPoint(-0.9F, 1.7F, 0.0F);
        this.leftArm3.addChild(leftThumb);
        this.setRotateAngle(leftThumb, -0.1014F, -0.0062F, 0.5896F);


        this.rightarm = new ModelRenderer(this);
        this.rightarm.setRotationPoint(-4.6F, 4.8651F, -3.3441F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, -0.5216F, -0.1584F, 0.663F);


        this.rightarm2 = new ModelRenderer(this);
        this.rightarm2.setRotationPoint(-0.1616F, 6.5389F, 4.1847F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -0.7464F, 0.6251F, -0.7098F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 9.0551F, -3.5341F);
        this.rightarm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, -0.2338F, 0.7124F, -0.4492F);


        this.rightArm4 = new ModelRenderer(this);
        this.rightArm4.setRotationPoint(-0.3F, 1.4605F, -0.0824F);
        this.rightArm3.addChild(rightArm4);
        this.setRotateAngle(rightArm4, 0.6533F, -0.0337F, -0.0294F);


        this.rightThumb = new ModelRenderer(this);
        this.rightThumb.setRotationPoint(0.9F, 1.7F, 0.0F);
        this.rightArm3.addChild(rightThumb);
        this.setRotateAngle(rightThumb, 0.0713F, -0.209F, -0.5597F);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 2.5F, -6.2F);
        this.chest.addChild(neck2);
        this.setRotateAngle(neck2, 0.0F, -0.0873F, 0.0F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.2F, -0.7F);
        this.neck2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2269F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 27, 33, -0.5F, 0.2F, -2.9F, 1, 1, 4, -0.15F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 1.0F, -3.8F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.1752F, -0.0859F, -0.0152F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.3F, -2.4F);
        this.neck.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0873F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 45, 12, -0.5F, 0.2F, -0.8F, 1, 1, 4, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.3F, -2.5F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.1745F, 0.0F, 0.0F);


        this.leftZygomaticarch = new ModelRenderer(this);
        this.leftZygomaticarch.setRotationPoint(3.0F, 0.1564F, -5.5582F);
        this.head.addChild(leftZygomaticarch);
        this.setRotateAngle(leftZygomaticarch, 0.0F, 0.3491F, 0.0F);


        this.rightZygomaticarch = new ModelRenderer(this);
        this.rightZygomaticarch.setRotationPoint(-3.0F, 0.1564F, -5.5582F);
        this.head.addChild(rightZygomaticarch);
        this.setRotateAngle(rightZygomaticarch, 0.0F, -0.3491F, 0.0F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.3F, 0.0F, -1.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.2703F, 0.0182F, 0.0181F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.2F, 3.6F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.3491F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 8, 20, -0.5F, 0.1F, 0.0F, 1, 1, 5, -0.15F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.3491F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 19, -1, -0.5F, 0.0F, -0.6F, 1, 1, 6, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1F, 4.8F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.48F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 18, -0.5F, 0.0F, -0.1F, 1, 1, 5, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.3491F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 20, 11, -0.5F, -0.1F, -0.7F, 1, 1, 5, -0.15F, false));

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
