package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonPiatnitzkysaurusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer root;
    private final ModelRenderer hips;
    private final ModelRenderer basin_r1;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftLeg2;
    private final ModelRenderer leftLeg3;
    private final ModelRenderer leftLeg4;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer rightLeg3;
    private final ModelRenderer rightLeg4;
    private final ModelRenderer tail1;
    private final ModelRenderer cube_r4;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer cube_r5;
    private final ModelRenderer body;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r8;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer neck1;
    private final ModelRenderer cube_r9;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r10;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r11;
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer throat;

    public ModelSkeletonPiatnitzkysaurusFrame() {
        this.textureWidth = 85;
        this.textureHeight = 85;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 1, 1, -0.5F, -23.0F, 1.3F, 1, 23, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.9F, -16.0F, -17.6F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.1745F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.4F, -4.0F, -0.5F, 1, 20, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.9F, -16.0F, -17.6F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -2.7F, -4.5F, -0.5F, 1, 9, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -18.5F, 1.8F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 3.5F, -4.5F, -0.5F, 1, 8, 1, -0.15F, false));

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(root);


        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -24.0F, 3.2F);
        this.root.addChild(hips);
        this.setRotateAngle(hips, 0.1744F, -0.0076F, 0.043F);


        this.basin_r1 = new ModelRenderer(this);
        this.basin_r1.setRotationPoint(0.0F, 0.6071F, 0.3707F);
        this.hips.addChild(basin_r1);
        this.setRotateAngle(basin_r1, -0.0262F, 0.0F, 0.0F);
        this.basin_r1.cubeList.add(new ModelBox(basin_r1, 16, 17, -0.5F, -0.6F, -6.0F, 1, 2, 11, 0.007F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(3.58F, 1.06F, -1.52F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.4349F, 0.0368F, 0.0791F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.48F, 9.9439F, 1.0908F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.9599F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(-0.6F, 9.4911F, 1.8661F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.9121F, -0.1037F, -0.08F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 5.7626F, 0.179F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.2182F, 0.0F, 0.0F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-3.58F, 1.06F, -1.52F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -1.4415F, 0.1757F, -0.2826F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.48F, 9.9439F, 1.0908F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.3963F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.6F, 9.4911F, 1.8661F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -1.0472F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 5.7626F, 0.179F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 1.7453F, 0.0F, 0.0F);


        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.2F, 5.18F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.064F, 0.1437F, 0.1642F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.2F, 1.009F, 4.631F);
        this.tail1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.0175F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 14, 31, -0.6F, -1.0F, -4.5F, 1, 2, 9, 0.0F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.4089F, 9.107F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0443F, 0.1744F, 0.0077F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 14, -0.5F, 0.0769F, -0.1267F, 1, 1, 12, -0.15F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.4264F, 11.8557F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0536F, 0.2179F, -0.0116F);
        this.tail3.cubeList.add(new ModelBox(tail3, 22, 3, -0.5F, 0.5004F, -0.4004F, 1, 1, 11, -0.15F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.6F, 10.7F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1625F, -0.2585F, 0.0419F);
        this.tail4.cubeList.add(new ModelBox(tail4, 32, 16, -0.5F, -0.0366F, -0.2748F, 1, 1, 9, -0.15F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0118F, 8.9186F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.3146F, -0.3332F, 0.106F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.4F, -0.9672F, 1.9647F);
        this.tail5.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 28, -0.1F, 0.9061F, -2.4122F, 1, 1, 10, -0.15F, false));

        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.26F, -5.22F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0701F, 0.0871F, 0.0061F);


        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.8F, -1.7846F, -6.7586F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0698F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 45, 27, 0.3F, 0.9698F, -5.0504F, 1, 2, 5, 0.007F, false));

        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.8F, -1.7846F, 0.6414F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1396F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 30, 39, 0.3F, 1.9997F, -7.3784F, 1, 2, 7, 0.02F, false));

        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -1.3846F, -11.7586F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, 0.0873F, 0.0F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.3F, -0.7F, -0.2F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1222F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 17, 43, -0.2F, 0.9557F, -5.9546F, 1, 2, 6, 0.0F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(4.5F, 6.67F, -6.16F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, -0.829F, 0.0F, 0.0F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.66F, -0.9233F, 5.1656F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.4602F, 0.0702F, -0.5633F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.15F, 1.1232F, 4.1629F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.0F, -0.1745F, 0.0F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-4.5F, 6.67F, -6.16F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, -1.3969F, 0.0151F, -0.0859F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(0.66F, -0.9233F, 5.1656F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.5708F, 0.0F, 0.3927F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.15F, 1.1232F, 4.1629F);
        this.rightArm2.addChild(rightArm3);


        this.neck1 = new ModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 0.36F, -5.52F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.2679F, -0.2106F, 0.0573F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 1.0046F, -3.964F);
        this.neck1.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0087F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 66, 61, -0.5F, -0.4238F, 1.5075F, 1, 2, 3, 0.007F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 41, 75, -0.5F, -0.7238F, -0.2925F, 1, 1, 2, -0.15F, false));

        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.0754F, -3.964F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, 0.1842F, 0.1651F, -0.1685F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.3F, -0.1F);
        this.neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.3491F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 51, -0.5F, 0.5993F, -4.5544F, 1, 1, 5, -0.15F, false));

        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -1.6F, -4.3F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.2699F, 0.2893F, -0.1176F);


        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -2.2275F, -2.8631F);
        this.neck3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0262F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 38, 66, -0.5F, 2.7F, -0.08F, 1, 1, 3, -0.15F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.3225F, -2.3031F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.1843F, 0.3675F, -0.0579F);


        this.jaw = new ModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.8567F, 0.6276F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.5219F, 0.0F, 0.0F);


        this.throat = new ModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 2.4523F, -4.294F);
        this.jaw.addChild(throat);

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
