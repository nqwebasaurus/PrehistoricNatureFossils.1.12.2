package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonSillosuchusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer bodyback;
    private final ModelRenderer cube_r4;
    private final ModelRenderer legL;
    private final ModelRenderer legL2;
    private final ModelRenderer legL3;
    private final ModelRenderer legL4;
    private final ModelRenderer legL5;
    private final ModelRenderer legL6;
    private final ModelRenderer legL7;
    private final ModelRenderer legL8;
    private final ModelRenderer tail;
    private final ModelRenderer cube_r5;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer cube_r6;
    private final ModelRenderer tail5;
    private final ModelRenderer body;
    private final ModelRenderer bodyfront;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer ArmL;
    private final ModelRenderer ArmL2;
    private final ModelRenderer ArmL3;
    private final ModelRenderer ArmL4;
    private final ModelRenderer ArmL5;
    private final ModelRenderer ArmL6;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r11;
    private final ModelRenderer bone;
    private final ModelRenderer head;
    private final ModelRenderer lowerjaw;
    private final ModelRenderer upperjaw;

    public ModelSkeletonSillosuchusFrame() {
        this.textureWidth = 100;
        this.textureHeight = 100;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, -1, -1, -1.0F, -31.7F, 2.9F, 2, 32, 2, -0.21F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(3.9F, 0.0F, -28.6F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.2618F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, -1, -1, -1.1F, -31.2F, -1.0F, 2, 32, 2, -0.21F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(3.9F, -22.4F, -28.6F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2182F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, -1, -1, -1.0F, -8.0F, -1.0F, 2, 16, 2, -0.2F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -16.0F, 3.9F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, -1, -1, -14.4F, -5.0F, -1.0F, 2, 11, 2, -0.2F, false));

        this.bodyback = new ModelRenderer(this);
        this.bodyback.setRotationPoint(0.0F, -34.15F, -13.0F);
        this.fossil.addChild(bodyback);
        this.setRotateAngle(bodyback, -0.0436F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.6909F, 12.1678F);
        this.bodyback.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 57, 47, -1.0F, 0.6742F, -0.3873F, 2, 1, 11, -0.2F, false));

        this.legL = new ModelRenderer(this);
        this.legL.setRotationPoint(5.0F, 3.0826F, 17.3211F);
        this.bodyback.addChild(legL);
        this.setRotateAngle(legL, -0.5236F, 0.0F, 0.0F);


        this.legL2 = new ModelRenderer(this);
        this.legL2.setRotationPoint(1.55F, 13.1071F, -0.4975F);
        this.legL.addChild(legL2);
        this.setRotateAngle(legL2, 0.8727F, 0.0F, 0.0F);


        this.legL3 = new ModelRenderer(this);
        this.legL3.setRotationPoint(-1.0F, 18.7911F, 3.1924F);
        this.legL2.addChild(legL3);
        this.setRotateAngle(legL3, -1.6581F, 0.0F, 0.0F);


        this.legL4 = new ModelRenderer(this);
        this.legL4.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.legL3.addChild(legL4);
        this.setRotateAngle(legL4, -0.2182F, 0.0F, 0.0F);


        this.legL5 = new ModelRenderer(this);
        this.legL5.setRotationPoint(-5.0F, 3.0826F, 17.3211F);
        this.bodyback.addChild(legL5);
        this.setRotateAngle(legL5, -0.3491F, 0.0F, 0.0F);


        this.legL6 = new ModelRenderer(this);
        this.legL6.setRotationPoint(-1.55F, 13.1071F, -0.4975F);
        this.legL5.addChild(legL6);
        this.setRotateAngle(legL6, 1.2217F, 0.0F, 0.0F);


        this.legL7 = new ModelRenderer(this);
        this.legL7.setRotationPoint(1.0F, 18.7911F, 3.1924F);
        this.legL6.addChild(legL7);
        this.setRotateAngle(legL7, -1.3963F, 0.0F, 0.0F);


        this.legL8 = new ModelRenderer(this);
        this.legL8.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.legL7.addChild(legL8);
        this.setRotateAngle(legL8, -1.0036F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 1.2948F, 22.6548F);
        this.bodyback.addChild(tail);
        this.setRotateAngle(tail, -0.0886F, 0.1739F, -0.0154F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 1.2076F, -0.6733F);
        this.tail.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0349F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 39, -1.0204F, -0.1826F, 0.2766F, 2, 1, 16, -0.2F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.6079F, 14.9792F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0876F, 0.0869F, 0.0076F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 18, -1.0236F, 1.0229F, -0.3694F, 2, 1, 18, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.315F, 17.4768F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.132F, -0.1298F, -0.0172F);
        this.tail3.cubeList.add(new ModelBox(tail3, 37, 42, -1.0341F, 1.3001F, -0.1741F, 2, 1, 13, -0.2F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.3064F, 12.9565F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.134F, -0.2163F, 0.0289F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.0248F, 0.9977F, 5.5807F);
        this.tail4.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0262F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 46, 13, -0.5F, -0.2F, -6.5F, 1, 1, 13, -0.2F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.291F, 11.7871F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.2256F, -0.2555F, 0.0579F);
        this.tail5.cubeList.add(new ModelBox(tail5, 55, 29, -0.5F, 0.7399F, -0.2841F, 1, 1, 13, -0.2F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.2796F, 12.2345F);
        this.bodyback.addChild(body);
        this.setRotateAngle(body, 0.0438F, -0.0872F, -0.0038F);
        this.body.cubeList.add(new ModelBox(body, 23, 21, -1.0F, 0.9819F, -17.6952F, 2, 1, 18, -0.2F, false));

        this.bodyfront = new ModelRenderer(this);
        this.bodyfront.setRotationPoint(0.0F, 0.2319F, -17.5952F);
        this.body.addChild(bodyfront);
        this.setRotateAngle(bodyfront, 0.088F, -0.1304F, -0.0115F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.1407F, -14.7742F);
        this.bodyfront.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0698F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 72, 43, -1.0102F, 0.889F, -0.2401F, 2, 1, 8, -0.2F, false));

        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.0102F, 1.1342F, -3.5026F);
        this.bodyfront.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0349F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 40, 57, -1.0F, -0.5F, -4.35F, 2, 1, 9, -0.2F, false));

        this.ArmL = new ModelRenderer(this);
        this.ArmL.setRotationPoint(8.0F, 10.0907F, -11.5742F);
        this.bodyfront.addChild(ArmL);
        this.setRotateAngle(ArmL, 0.7038F, 0.1447F, 0.2355F);


        this.ArmL2 = new ModelRenderer(this);
        this.ArmL2.setRotationPoint(0.25F, 8.4426F, 0.3038F);
        this.ArmL.addChild(ArmL2);
        this.setRotateAngle(ArmL2, -1.0712F, 0.27F, 0.1446F);


        this.ArmL3 = new ModelRenderer(this);
        this.ArmL3.setRotationPoint(0.9F, 7.3976F, -1.1488F);
        this.ArmL2.addChild(ArmL3);
        this.setRotateAngle(ArmL3, 0.0F, 0.0F, 0.3054F);


        this.ArmL4 = new ModelRenderer(this);
        this.ArmL4.setRotationPoint(-8.0F, 10.0907F, -11.5742F);
        this.bodyfront.addChild(ArmL4);
        this.setRotateAngle(ArmL4, 0.3914F, 0.0334F, -0.0807F);


        this.ArmL5 = new ModelRenderer(this);
        this.ArmL5.setRotationPoint(-0.25F, 8.4426F, 0.3038F);
        this.ArmL4.addChild(ArmL5);
        this.setRotateAngle(ArmL5, -1.0178F, -0.4968F, -0.2861F);


        this.ArmL6 = new ModelRenderer(this);
        this.ArmL6.setRotationPoint(-0.9F, 7.3976F, -1.1488F);
        this.ArmL5.addChild(ArmL6);
        this.setRotateAngle(ArmL6, 0.0F, 0.0F, -0.3054F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.032F, -14.1239F);
        this.bodyfront.addChild(neck);
        this.setRotateAngle(neck, -0.6623F, -0.5844F, 0.3136F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.6285F, -0.5479F);
        this.neck.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1222F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 66, 68, -0.8204F, 0.5875F, -7.4955F, 2, 1, 9, -0.2F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.7761F, -7.8805F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.4157F, -0.5373F, -0.0641F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.8407F, 0.1472F);
        this.neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0524F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, -2, 56, -0.7065F, 0.41F, -11.5088F, 2, 1, 13, -0.2F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 1.3549F, -10.792F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.2409F, -0.6325F, -0.6917F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 2.2647F, -6.6457F);
        this.neck3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1396F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 16, 58, -0.8247F, -0.6567F, -0.489F, 2, 1, 8, -0.2F, false));

        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(-1.0F, 0.011F, -0.4304F);
        this.neck3.addChild(bone);


        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.6291F, -6.5484F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.3535F, -0.5961F, -0.3977F);


        this.lowerjaw = new ModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.5F, 1.9085F, 0.3174F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 0.2182F, 0.0F, 0.0F);


        this.upperjaw = new ModelRenderer(this);
        this.upperjaw.setRotationPoint(0.5F, 1.9085F, 0.3174F);
        this.head.addChild(upperjaw);

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
