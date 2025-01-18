package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonScelidosaurusFrame extends ModelBase {
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
    private final ModelRenderer hipsOsteoderms;
    private final ModelRenderer hipsOsteoderms2;
    private final ModelRenderer tail;
    private final ModelRenderer tailOsteoderms;
    private final ModelRenderer tailOsteoderms2;
    private final ModelRenderer tail2;
    private final ModelRenderer tail2Osteoderms;
    private final ModelRenderer tail2Osteoderms2;
    private final ModelRenderer tail3;
    private final ModelRenderer tail3Osteoderms;
    private final ModelRenderer tail3Osteoderms2;
    private final ModelRenderer tail4;
    private final ModelRenderer tail4Osteoderms;
    private final ModelRenderer tail4Osteoderms2;
    private final ModelRenderer tail5;
    private final ModelRenderer tail5Osteoderms;
    private final ModelRenderer tail5Osteoderms2;
    private final ModelRenderer body;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer bodyOsteoderms;
    private final ModelRenderer bodyOsteoderms2;
    private final ModelRenderer chest;
    private final ModelRenderer cube_r7;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftArm2;
    private final ModelRenderer leftArm3;
    private final ModelRenderer rightArm;
    private final ModelRenderer rightArm2;
    private final ModelRenderer rightArm3;
    private final ModelRenderer chestOsteoderms;
    private final ModelRenderer chestOsteoderms2;
    private final ModelRenderer neck;
    private final ModelRenderer cube_r8;
    private final ModelRenderer bipartiteOsteoderm3;
    private final ModelRenderer bipartiteOsteoderm6;
    private final ModelRenderer neck2;
    private final ModelRenderer cube_r9;
    private final ModelRenderer bipartiteOsteoderm2;
    private final ModelRenderer bipartiteOsteoderm5;
    private final ModelRenderer neck3;
    private final ModelRenderer cube_r10;
    private final ModelRenderer bipartiteOsteoderm;
    private final ModelRenderer bipartiteOsteoderm4;
    private final ModelRenderer head;
    private final ModelRenderer occipitalhorn;
    private final ModelRenderer occipitalhorn2;
    private final ModelRenderer Jaw;

    public ModelSkeletonScelidosaurusFrame() {
        this.textureWidth = 135;
        this.textureHeight = 135;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 2, 1, -0.5F, -18.0F, 1.5F, 1, 18, 1, -0.16F, false));

        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(3.4F, -16.2F, -20.9F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.2094F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 1, -0.5F, -5.6F, -0.5F, 1, 22, 1, -0.16F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(3.4F, -16.2F, -20.9F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2094F, 0.0F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 2, 1, 0.7F, -4.2F, -0.5F, 1, 8, 1, -0.15F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -15.0F, 2.0F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 1, 2.6F, -4.0F, -0.5F, 1, 8, 1, -0.15F, false));

        this.hips = new ModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -21.6F, 0.0F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.2182F, 0.0F, 0.0F);


        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 41, 38, -0.5F, 2.2F, -1.4F, 1, 1, 10, -0.15F, false));

        this.leftLeg = new ModelRenderer(this);
        this.leftLeg.setRotationPoint(4.0F, 2.9F, 2.7F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.2618F, 0.0F, 0.0F);


        this.leftLeg2 = new ModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.3F, 8.2932F, 1.4924F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.1345F, 0.0F, 0.0F);


        this.leftLeg3 = new ModelRenderer(this);
        this.leftLeg3.setRotationPoint(-0.5F, 8.1458F, 0.9011F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.48F, 0.0F, 0.0F);


        this.leftLeg4 = new ModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 3.9609F, 0.1467F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, -0.1745F, 0.0F, 0.0F);


        this.rightLeg = new ModelRenderer(this);
        this.rightLeg.setRotationPoint(-4.0F, 2.9F, 2.7F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.6109F, 0.0F, 0.0F);


        this.rightLeg2 = new ModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.3F, 8.2932F, 1.4924F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.0472F, 0.0F, 0.0F);


        this.rightLeg3 = new ModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.5F, 8.1458F, 0.9011F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.829F, 0.0F, 0.0F);


        this.rightLeg4 = new ModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 3.9609F, 0.1467F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.6109F, 0.0F, 0.0F);


        this.hipsOsteoderms = new ModelRenderer(this);
        this.hipsOsteoderms.setRotationPoint(1.4F, -0.9589F, 5.103F);
        this.hips.addChild(hipsOsteoderms);


        this.hipsOsteoderms2 = new ModelRenderer(this);
        this.hipsOsteoderms2.setRotationPoint(-1.4F, -0.9589F, 5.103F);
        this.hips.addChild(hipsOsteoderms2);


        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 2.5976F, 7.7784F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.0632F, 0.2613F, -0.0164F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 15, -0.5F, 0.2829F, 0.1129F, 1, 1, 11, -0.15F, false));

        this.tailOsteoderms = new ModelRenderer(this);
        this.tailOsteoderms.setRotationPoint(1.4F, -3.1171F, 1.6129F);
        this.tail.addChild(tailOsteoderms);


        this.tailOsteoderms2 = new ModelRenderer(this);
        this.tailOsteoderms2.setRotationPoint(-1.4F, -3.1171F, 1.6129F);
        this.tail.addChild(tailOsteoderms2);


        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.1906F, 10.8833F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0089F, 0.2182F, 0.0019F);
        this.tail2.cubeList.add(new ModelBox(tail2, 63, 47, -0.5F, 0.4218F, -0.1424F, 1, 1, 8, -0.15F, false));

        this.tail2Osteoderms = new ModelRenderer(this);
        this.tail2Osteoderms.setRotationPoint(1.2F, -0.6782F, 7.9576F);
        this.tail2.addChild(tail2Osteoderms);


        this.tail2Osteoderms2 = new ModelRenderer(this);
        this.tail2Osteoderms2.setRotationPoint(-1.2F, -0.6782F, 7.9576F);
        this.tail2.addChild(tail2Osteoderms2);


        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1392F, 7.8499F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1485F, -0.0432F, 0.0065F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 41, -0.5F, 0.2712F, -0.161F, 1, 1, 9, -0.15F, false));

        this.tail3Osteoderms = new ModelRenderer(this);
        this.tail3Osteoderms.setRotationPoint(0.8072F, -0.7288F, 0.9196F);
        this.tail3.addChild(tail3Osteoderms);


        this.tail3Osteoderms2 = new ModelRenderer(this);
        this.tail3Osteoderms2.setRotationPoint(-0.8072F, -0.7288F, 0.9196F);
        this.tail3.addChild(tail3Osteoderms2);


        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.0288F, 8.939F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0903F, -0.2608F, 0.0233F);
        this.tail4.cubeList.add(new ModelBox(tail4, 63, 57, -0.5F, 0.3019F, -0.3436F, 1, 1, 8, -0.15F, false));

        this.tail4Osteoderms = new ModelRenderer(this);
        this.tail4Osteoderms.setRotationPoint(1.5F, 1.2019F, 4.4564F);
        this.tail4.addChild(tail4Osteoderms);


        this.tail4Osteoderms2 = new ModelRenderer(this);
        this.tail4Osteoderms2.setRotationPoint(-1.5F, 1.2019F, 4.4564F);
        this.tail4.addChild(tail4Osteoderms2);


        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0019F, 7.8564F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.006F, -0.2577F, 0.0465F);
        this.tail5.cubeList.add(new ModelBox(tail5, 25, 27, -0.5F, 0.2902F, -0.5883F, 1, 1, 10, -0.15F, false));

        this.tail5Osteoderms = new ModelRenderer(this);
        this.tail5Osteoderms.setRotationPoint(0.1F, -0.4098F, 9.9117F);
        this.tail5.addChild(tail5Osteoderms);


        this.tail5Osteoderms2 = new ModelRenderer(this);
        this.tail5Osteoderms2.setRotationPoint(-0.1F, -0.4098F, 9.9117F);
        this.tail5.addChild(tail5Osteoderms2);


        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 2.1F, -1.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, -0.0436F, -0.1309F, 0.0F);


        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -1.0F, -7.2F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0349F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 79, -1.0F, 0.792F, 0.0135F, 1, 1, 7, -0.15F, false));

        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -2.7F, -13.9F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1833F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 34, 86, -1.0F, 3.7F, 0.4F, 1, 1, 6, -0.15F, false));

        this.bodyOsteoderms = new ModelRenderer(this);
        this.bodyOsteoderms.setRotationPoint(5.0681F, 6.5016F, -1.9836F);
        this.body.addChild(bodyOsteoderms);


        this.bodyOsteoderms2 = new ModelRenderer(this);
        this.bodyOsteoderms2.setRotationPoint(-5.0681F, 6.5016F, -1.9836F);
        this.body.addChild(bodyOsteoderms2);


        this.chest = new ModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.5F, -12.9F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0F, -0.1309F, 0.0F);


        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 2.9F, -7.4F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2967F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 63, 37, -0.5F, -0.2011F, 0.1837F, 1, 1, 8, -0.15F, false));

        this.leftArm = new ModelRenderer(this);
        this.leftArm.setRotationPoint(2.9374F, 5.8803F, -5.9046F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 1.2246F, 0.045F, -0.258F);


        this.leftArm2 = new ModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0397F, 6.5668F, -0.7516F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.0375F, 0.2524F, -0.0967F);


        this.leftArm3 = new ModelRenderer(this);
        this.leftArm3.setRotationPoint(0.4324F, 5.9545F, -0.6483F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 1.866F, 0.1926F, 0.4897F);


        this.rightArm = new ModelRenderer(this);
        this.rightArm.setRotationPoint(-2.9374F, 5.8803F, -5.9046F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 1.2683F, -0.045F, 0.258F);


        this.rightArm2 = new ModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.0397F, 6.5668F, -0.7516F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.2993F, -0.2524F, 0.0967F);


        this.rightArm3 = new ModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.4324F, 5.9545F, -0.6483F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 1.866F, -0.1926F, -0.4897F);


        this.chestOsteoderms = new ModelRenderer(this);
        this.chestOsteoderms.setRotationPoint(0.0F, -2.5F, -0.9F);
        this.chest.addChild(chestOsteoderms);


        this.chestOsteoderms2 = new ModelRenderer(this);
        this.chestOsteoderms2.setRotationPoint(0.0F, -2.5F, -0.9F);
        this.chest.addChild(chestOsteoderms2);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 2.3F, -7.5F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.0435F, -0.0038F, -0.0872F);


        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.3496F, 0.7459F);
        this.neck.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0873F, -0.0174F, 0.0015F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 63, 104, -0.5F, -0.0775F, -3.8859F, 1, 1, 4, -0.15F, false));

        this.bipartiteOsteoderm3 = new ModelRenderer(this);
        this.bipartiteOsteoderm3.setRotationPoint(3.8881F, -0.7104F, -2.0107F);
        this.neck.addChild(bipartiteOsteoderm3);
        this.setRotateAngle(bipartiteOsteoderm3, 0.0F, 0.0F, 0.0F);


        this.bipartiteOsteoderm6 = new ModelRenderer(this);
        this.bipartiteOsteoderm6.setRotationPoint(-3.8881F, -0.7104F, -2.0107F);
        this.neck.addChild(bipartiteOsteoderm6);
        this.setRotateAngle(bipartiteOsteoderm6, 0.0F, 0.0F, 0.0F);


        this.neck2 = new ModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.3504F, -2.7541F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.4505F, -0.49F, -0.3187F);


        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 1.4056F, -2.6947F);
        this.neck2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2443F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 33, 105, -0.5F, -0.4123F, 0.2574F, 1, 1, 3, -0.15F, false));

        this.bipartiteOsteoderm2 = new ModelRenderer(this);
        this.bipartiteOsteoderm2.setRotationPoint(2.16F, 0.7681F, -2.2875F);
        this.neck2.addChild(bipartiteOsteoderm2);
        this.setRotateAngle(bipartiteOsteoderm2, 0.1309F, 0.0F, 0.0F);


        this.bipartiteOsteoderm5 = new ModelRenderer(this);
        this.bipartiteOsteoderm5.setRotationPoint(-2.16F, 0.7681F, -2.2875F);
        this.neck2.addChild(bipartiteOsteoderm5);
        this.setRotateAngle(bipartiteOsteoderm5, 0.1309F, 0.0F, 0.0F);


        this.neck3 = new ModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.6866F, -2.6915F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.6281F, -0.3587F, -0.443F);


        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -1.0795F, -3.2718F);
        this.neck3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2967F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 11, 99, -0.5F, 0.4155F, 0.0188F, 1, 1, 4, -0.15F, false));

        this.bipartiteOsteoderm = new ModelRenderer(this);
        this.bipartiteOsteoderm.setRotationPoint(1.3144F, -1.1915F, -1.934F);
        this.neck3.addChild(bipartiteOsteoderm);
        this.setRotateAngle(bipartiteOsteoderm, -0.2182F, 0.0F, 0.0F);


        this.bipartiteOsteoderm4 = new ModelRenderer(this);
        this.bipartiteOsteoderm4.setRotationPoint(-1.3144F, -1.1915F, -1.934F);
        this.neck3.addChild(bipartiteOsteoderm4);
        this.setRotateAngle(bipartiteOsteoderm4, -0.2182F, 0.0F, 0.0F);


        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.9795F, -3.1718F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.4079F, -0.2308F, -0.0092F);


        this.occipitalhorn = new ModelRenderer(this);
        this.occipitalhorn.setRotationPoint(0.9F, -1.7809F, 0.353F);
        this.head.addChild(occipitalhorn);


        this.occipitalhorn2 = new ModelRenderer(this);
        this.occipitalhorn2.setRotationPoint(-0.9F, -1.7809F, 0.353F);
        this.head.addChild(occipitalhorn2);


        this.Jaw = new ModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.8528F, -0.3321F);
        this.head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.2531F, 0.0F, 0.0F);

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
