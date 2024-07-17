package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonSuzhousaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer hips;
    private final ModelRenderer cube_r4;
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r6;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer leftArm4;
    private final ModelRenderer leftArm5;
    private final ModelRenderer leftArm6;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer rightArm4;
    private final ModelRenderer rightArm5;
    private final ModelRenderer rightArm6;
    private final ModelRenderer neck5;
    private final ModelRenderer cube_r7;
    private final ModelRenderer neck4;
    private final ModelRenderer cube_r8;
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
    private final ModelRenderer tail5;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftLeg4;
    private final ModelRenderer leftLeg5;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer rightLeg5;

    public ModelSkeletonSuzhousaurusFrame() {
        this.textureWidth = 112;
        this.textureHeight = 112;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -29.0F, -0.7F, 1, 29, 1, -0.1F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -24.9F, -21.5F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.1222F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 1.5F, -7.1F, -0.5F, 1, 32, 1, -0.1F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -24.9F, -21.5F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1222F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -0.1F, -5.5F, -0.5F, 1, 16, 1, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -24.5F, -0.2F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, -0.1F, -6.5F, -0.5F, 1, 13, 1, 0.0F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -24.5F, 0.0F);
        this.fossil.addChild(hips);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -9.1F, -6.1F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.4189F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 14, -0.5F, 1.0F, 0.0F, 1, 3, 15, 0.0F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -8.0F, -7.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0F, -0.0873F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.5F, -8.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 48, 48, -0.5F, 0.8F, 0.0F, 1, 3, 9, 0.004F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -1.0F, -9.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, -0.0436F, 0.0F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.6F, 0.8F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0698F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 17, 54, -0.5F, 0.9F, -7.8F, 1, 3, 8, 0.0F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(7.8906F, 7.8609F, -5.2092F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, -1.5146F, 0.5834F, -0.5672F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 0.0F, 9.4F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.1891F, -0.0477F, -0.215F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 8.8F, -0.6F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.0F, 0.0F, 0.3054F);


        this.leftArm4 = new ModelRenderer(this);
        this.leftArm4.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.leftArm3.addChild(leftArm4);
        this.setRotateAngle(leftArm4, -0.2182F, 0.0F, 0.0F);


        this.leftArm5 = new ModelRenderer(this);
        this.leftArm5.setRotationPoint(0.0F, 3.0F, 1.0F);
        this.leftArm3.addChild(leftArm5);


        this.leftArm6 = new ModelRenderer(this);
        this.leftArm6.setRotationPoint(0.0F, 3.0F, 2.0F);
        this.leftArm3.addChild(leftArm6);
        this.setRotateAngle(leftArm6, 0.1309F, 0.0F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-7.8906F, 7.8609F, -5.2092F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, -2.6493F, -0.0423F, 0.4441F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 0.0F, 9.4F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.7418F, 0.0873F, 0.0F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 8.8F, -0.6F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.0F, 0.0F, -0.5236F);


        this.rightArm4 = new ModelRenderer(this);
        this.rightArm4.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.rightArm3.addChild(rightArm4);
        this.setRotateAngle(rightArm4, -0.2182F, 0.0F, 0.0F);


        this.rightArm5 = new ModelRenderer(this);
        this.rightArm5.setRotationPoint(0.0F, 3.0F, 1.0F);
        this.rightArm3.addChild(rightArm5);


        this.rightArm6 = new ModelRenderer(this);
        this.rightArm6.setRotationPoint(0.0F, 3.0F, 2.0F);
        this.rightArm3.addChild(rightArm6);
        this.setRotateAngle(rightArm6, 0.1309F, 0.0F, 0.0F);


        this.neck5 = new ModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, -0.1F, -6.2F);
        this.chest.addChild(neck5);
        this.setRotateAngle(neck5, 0.0F, -0.0873F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -2.1F, -5.0F);
        this.neck5.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.192F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 11, 75, -0.5F, 0.8F, 0.0F, 1, 2, 6, 0.0F, false));

        this.neck4 = new ModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -1.8F, -5.3F);
        this.neck5.addChild(neck4);
        this.setRotateAngle(neck4, -0.088F, -0.1304F, 0.0115F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.3F, 0.4F);
        this.neck4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2705F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 69, -0.5F, 0.1583F, -6.8835F, 1, 1, 7, -0.1F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -1.7F, -6.2F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, -0.0117F, -0.2615F, 0.0452F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.1841F, -2.8171F);
        this.neck3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.6283F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 24, 68, -0.4F, -0.5F, -4.0F, 1, 1, 8, -0.1F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -3.8908F, -5.5F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, 0.0082F, -0.2187F, 0.0408F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -4.9092F, -5.1F);
        this.neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.6807F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 62, 48, -0.5F, 0.7F, 0.1F, 1, 1, 7, -0.1F, false));

        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -4.5092F, -5.2F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, -0.3201F, -0.1939F, 0.1097F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -2.0F, -5.2F);
        this.neck.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.3142F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 77, 60, -0.5F, 0.6F, -0.3F, 1, 1, 6, -0.1F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.5F, -4.5F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.2626F, -0.3243F, -0.3084F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.5F, 2.0F, -0.5F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.3142F, 0.0F, 0.0F);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.7F, 7.1F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.4911F, -0.224F, 0.1395F);
        this.tail.cubeList.add(new ModelBox(tail, 48, 5, -0.5F, -0.3F, -0.3F, 1, 2, 9, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -1.2F, 8.6F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1056F, -0.1302F, -0.0138F);
        this.tail2.cubeList.add(new ModelBox(tail2, 65, 60, -0.5F, 0.6F, -0.7F, 1, 1, 9, -0.1F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 7.9F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1314F, -0.0865F, -0.0114F);
        this.tail3.cubeList.add(new ModelBox(tail3, 62, 0, -0.5F, 0.6F, -0.1F, 1, 1, 8, -0.1F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 7.9F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1223F, 0.0433F, -0.0053F);
        this.tail4.cubeList.add(new ModelBox(tail4, 13, 66, -0.5F, 0.6F, 0.0F, 1, 1, 8, -0.1F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.4548F, 0.276F, -0.1325F);
        this.tail5.cubeList.add(new ModelBox(tail5, 36, 76, -0.5F, 0.6F, 0.0F, 1, 1, 6, -0.1F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(6.0F, 0.0F, -1.3F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.0872F, -0.0038F, -0.0435F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(-1.0F, 12.1F, 3.0F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, -0.7243F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(-0.2F, -1.2F, 13.7F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -1.8675F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(-0.5F, 0.6F, 5.1F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, -0.4625F, 0.0F, 0.0F);


        this.leftLeg5 = new ModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.leftLeg4.addChild(leftLeg5);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-6.0F, 0.0F, -1.3F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.6939F, -0.084F, -0.1005F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(1.0F, 12.1F, 3.0F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, -0.5559F, -0.0055F, 0.1571F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.2F, -1.2F, 13.7F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -1.8675F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.5F, 0.6F, 5.1F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, -0.0262F, 0.0F, 0.0F);


        this.rightLeg5 = new ModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.rightLeg4.addChild(rightLeg5);

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
