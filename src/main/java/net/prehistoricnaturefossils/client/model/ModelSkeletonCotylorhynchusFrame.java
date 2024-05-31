package net.prehistoricnaturefossils.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCotylorhynchusFrame extends ModelBase {
    private final ModelRenderer fossil;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer main;
    private final ModelRenderer bodyCentreFront;
    private final ModelRenderer bodyCentreFront_r1;
    private final ModelRenderer bodyCentreFront_r2;
    private final ModelRenderer shoulder;
    private final ModelRenderer shoulderU_r1;
    private final ModelRenderer legFrontL;
    private final ModelRenderer legFrontLLower;
    private final ModelRenderer legFrontLFoot;
    private final ModelRenderer legFrontL2;
    private final ModelRenderer legFrontLLower2;
    private final ModelRenderer legFrontLFoot2;
    private final ModelRenderer neck;
    private final ModelRenderer neck_r1;
    private final ModelRenderer neck_r2;
    private final ModelRenderer head;
    private final ModelRenderer skullTop;
    private final ModelRenderer skullJaw;
    private final ModelRenderer rump;
    private final ModelRenderer rump_r1;
    private final ModelRenderer bodyBack;
    private final ModelRenderer rump_r2;
    private final ModelRenderer tail1;
    private final ModelRenderer tail2_r1;
    private final ModelRenderer tail2;
    private final ModelRenderer tail3_r1;
    private final ModelRenderer tail3;
    private final ModelRenderer tail4_r1;
    private final ModelRenderer tail4;
    private final ModelRenderer tail5;
    private final ModelRenderer tail6_r1;
    private final ModelRenderer tail6;
    private final ModelRenderer tail6_r2;
    private final ModelRenderer legBackL;
    private final ModelRenderer legBackLLower;
    private final ModelRenderer legBackLFoot;
    private final ModelRenderer legBackL2;
    private final ModelRenderer legBackLLower2;
    private final ModelRenderer legBackLFoot2;

    public ModelSkeletonCotylorhynchusFrame() {
        this.textureWidth = 95;
        this.textureHeight = 95;

        this.fossil = new ModelRenderer(this);
        this.fossil.setRotationPoint(-0.5F, 22.0F, -4.0F);


        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.6F, -8.5F, 20.9F);
        this.fossil.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.2618F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, -0.5F, -4.5F, -0.5F, 1, 15, 1, 0.0F, false));

        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.6F, -8.5F, 20.9F);
        this.fossil.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2618F, 0.0F, 1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -0.1F, -5.5F, -0.5F, 1, 11, 1, 0.0F, false));

        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -8.5F, -14.1F);
        this.fossil.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0873F, 0.0F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 0.8F, -5.5F, -0.5F, 1, 11, 1, 0.0F, false));

        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -8.5F, -14.1F);
        this.fossil.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0873F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, -0.7F, -5.5F, -0.5F, 1, 16, 1, 0.0F, false));

        this.main = new ModelRenderer(this);
        this.main.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(main);
        this.setRotateAngle(main, -0.1134F, 0.0F, 0.0F);


        this.bodyCentreFront = new ModelRenderer(this);
        this.bodyCentreFront.setRotationPoint(0.5F, -17.4581F, 8.7919F);
        this.main.addChild(bodyCentreFront);


        this.bodyCentreFront_r1 = new ModelRenderer(this);
        this.bodyCentreFront_r1.setRotationPoint(1.2F, 0.3839F, -9.0494F);
        this.bodyCentreFront.addChild(bodyCentreFront_r1);
        this.setRotateAngle(bodyCentreFront_r1, 0.0175F, 0.0F, 0.0F);
        this.bodyCentreFront_r1.cubeList.add(new ModelBox(bodyCentreFront_r1, 18, 13, -2.2F, -0.1739F, -0.1666F, 2, 2, 11, -0.2F, false));

        this.bodyCentreFront_r2 = new ModelRenderer(this);
        this.bodyCentreFront_r2.setRotationPoint(0.0F, 1.0F, -19.0F);
        this.bodyCentreFront.addChild(bodyCentreFront_r2);
        this.setRotateAngle(bodyCentreFront_r2, 0.1396F, 0.0F, 0.0F);
        this.bodyCentreFront_r2.cubeList.add(new ModelBox(bodyCentreFront_r2, 0, 51, -1.0F, 0.6074F, 0.1972F, 2, 2, 10, -0.2F, false));

        this.shoulder = new ModelRenderer(this);
        this.shoulder.setRotationPoint(0.0F, 1.369F, -18.517F);
        this.bodyCentreFront.addChild(shoulder);
        this.setRotateAngle(shoulder, 0.0F, 0.0436F, 0.0F);


        this.shoulderU_r1 = new ModelRenderer(this);
        this.shoulderU_r1.setRotationPoint(0.0F, 0.7461F, -6.4278F);
        this.shoulder.addChild(shoulderU_r1);
        this.setRotateAngle(shoulderU_r1, 0.3927F, 0.0F, 0.0F);
        this.shoulderU_r1.cubeList.add(new ModelBox(shoulderU_r1, 18, 28, -1.0F, 1.869F, -4.7205F, 2, 2, 11, -0.2F, false));

        this.legFrontL = new ModelRenderer(this);
        this.legFrontL.setRotationPoint(5.5F, 10.3722F, -4.9292F);
        this.shoulder.addChild(legFrontL);
        this.setRotateAngle(legFrontL, -0.0481F, -0.4359F, 0.1512F);


        this.legFrontLLower = new ModelRenderer(this);
        this.legFrontLLower.setRotationPoint(4.5613F, 0.5798F, 3.7987F);
        this.legFrontL.addChild(legFrontLLower);
        this.setRotateAngle(legFrontLLower, 0.0F, 0.1309F, -0.2182F);


        this.legFrontLFoot = new ModelRenderer(this);
        this.legFrontLFoot.setRotationPoint(2.7046F, 7.4765F, -2.0879F);
        this.legFrontLLower.addChild(legFrontLFoot);
        this.setRotateAngle(legFrontLFoot, 0.1745F, -0.0873F, 0.0436F);


        this.legFrontL2 = new ModelRenderer(this);
        this.legFrontL2.setRotationPoint(-5.5F, 10.3722F, -4.9292F);
        this.shoulder.addChild(legFrontL2);
        this.setRotateAngle(legFrontL2, -0.1322F, -1.2496F, 0.3003F);


        this.legFrontLLower2 = new ModelRenderer(this);
        this.legFrontLLower2.setRotationPoint(-4.5613F, 0.5798F, 3.7987F);
        this.legFrontL2.addChild(legFrontLLower2);
        this.setRotateAngle(legFrontLLower2, -0.0613F, 0.3052F, 0.3973F);


        this.legFrontLFoot2 = new ModelRenderer(this);
        this.legFrontLFoot2.setRotationPoint(-2.3046F, 9.2765F, 0.9121F);
        this.legFrontLLower2.addChild(legFrontLFoot2);
        this.setRotateAngle(legFrontLFoot2, 0.832F, 0.6521F, -0.4931F);


        this.neck = new ModelRenderer(this);
        this.neck.setRotationPoint(-0.5F, 3.9186F, -9.9167F);
        this.shoulder.addChild(neck);
        this.setRotateAngle(neck, 0.0F, 0.3491F, 0.0F);


        this.neck_r1 = new ModelRenderer(this);
        this.neck_r1.setRotationPoint(0.0F, 1.5658F, -3.9073F);
        this.neck.addChild(neck_r1);
        this.setRotateAngle(neck_r1, 0.1745F, 0.0F, 0.0F);
        this.neck_r1.cubeList.add(new ModelBox(neck_r1, 68, 41, -0.5F, -0.5741F, -0.0271F, 2, 2, 5, -0.2F, false));

        this.neck_r2 = new ModelRenderer(this);
        this.neck_r2.setRotationPoint(0.1F, 1.5658F, -2.9073F);
        this.neck.addChild(neck_r2);
        this.setRotateAngle(neck_r2, 0.0436F, 0.3054F, 0.0F);
        this.neck_r2.cubeList.add(new ModelBox(neck_r2, 76, 20, -0.5F, -0.7177F, -4.0261F, 2, 2, 4, -0.2F, false));

        this.head = new ModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.6536F, -7.1125F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.2182F, 0.2618F, 0.0F);


        this.skullTop = new ModelRenderer(this);
        this.skullTop.setRotationPoint(-1.2F, -0.2F, 0.6F);
        this.head.addChild(skullTop);
        this.setRotateAngle(skullTop, 0.132F, 0.1298F, 0.0172F);


        this.skullJaw = new ModelRenderer(this);
        this.skullJaw.setRotationPoint(0.5012F, 1.6623F, -0.4822F);
        this.skullTop.addChild(skullJaw);
        this.setRotateAngle(skullJaw, 0.1745F, 0.0F, 0.0F);


        this.rump = new ModelRenderer(this);
        this.rump.setRotationPoint(0.0F, 0.1442F, 1.7994F);
        this.bodyCentreFront.addChild(rump);
        this.setRotateAngle(rump, 0.0F, -0.2182F, 0.0F);


        this.rump_r1 = new ModelRenderer(this);
        this.rump_r1.setRotationPoint(-5.5F, 0.197F, -0.2456F);
        this.rump.addChild(rump_r1);
        this.setRotateAngle(rump_r1, -0.1571F, 0.0F, 0.0F);
        this.rump_r1.cubeList.add(new ModelBox(rump_r1, 54, 41, 4.5F, -0.2302F, 0.0412F, 2, 2, 9, -0.2F, false));

        this.bodyBack = new ModelRenderer(this);
        this.bodyBack.setRotationPoint(-0.5F, 1.397F, 8.2544F);
        this.rump.addChild(bodyBack);
        this.setRotateAngle(bodyBack, 0.0F, -0.1745F, 0.0F);


        this.rump_r2 = new ModelRenderer(this);
        this.rump_r2.setRotationPoint(-5.0F, -0.4F, 0.1F);
        this.bodyBack.addChild(rump_r2);
        this.setRotateAngle(rump_r2, -0.2443F, 0.0F, 0.0F);
        this.rump_r2.cubeList.add(new ModelBox(rump_r2, 20, 0, 4.5F, 0.325F, -0.0781F, 2, 2, 6, -0.2F, false));

        this.tail1 = new ModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 1.2F, 5.4F);
        this.bodyBack.addChild(tail1);
        this.setRotateAngle(tail1, 0.0F, -0.3054F, 0.0F);


        this.tail2_r1 = new ModelRenderer(this);
        this.tail2_r1.setRotationPoint(0.0F, 0.0F, -0.1F);
        this.tail1.addChild(tail2_r1);
        this.setRotateAngle(tail2_r1, -0.1658F, 0.0F, 0.0F);
        this.tail2_r1.cubeList.add(new ModelBox(tail2_r1, 34, 16, -0.5F, 0.1135F, 0.0941F, 2, 2, 11, -0.2F, false));

        this.tail2 = new ModelRenderer(this);
        this.tail2.setRotationPoint(0.5F, 1.6633F, 10.4496F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0F, -0.1309F, 0.0F);


        this.tail3_r1 = new ModelRenderer(this);
        this.tail3_r1.setRotationPoint(0.0F, 0.2F, 0.2F);
        this.tail2.addChild(tail3_r1);
        this.setRotateAngle(tail3_r1, -0.0873F, 0.0F, 0.0F);
        this.tail3_r1.cubeList.add(new ModelBox(tail3_r1, 50, 14, -1.0F, -0.0091F, -0.1908F, 2, 2, 10, -0.2F, false));

        this.tail3 = new ModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 1.0543F, 9.3111F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0F, 0.3054F, 0.0F);


        this.tail4_r1 = new ModelRenderer(this);
        this.tail4_r1.setRotationPoint(0.0F, 3.0F, 0.3F);
        this.tail3.addChild(tail4_r1);
        this.setRotateAngle(tail4_r1, -0.0436F, 0.0F, 0.0F);
        this.tail4_r1.cubeList.add(new ModelBox(tail4_r1, 54, 53, -1.0F, -3.0F, -0.5F, 2, 2, 9, -0.2F, false));

        this.tail4 = new ModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0824F, 8.3393F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0F, 0.3927F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 16, 55, -0.5F, 0.3F, -0.5F, 1, 2, 9, -0.2F, false));

        this.tail5 = new ModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.1619F, 8.0703F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0F, 0.2182F, 0.0F);


        this.tail6_r1 = new ModelRenderer(this);
        this.tail6_r1.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tail5.addChild(tail6_r1);
        this.setRotateAngle(tail6_r1, 0.0436F, 0.0F, 0.0F);
        this.tail6_r1.cubeList.add(new ModelBox(tail6_r1, 37, 57, -0.5F, -2.3995F, -0.014F, 1, 1, 9, -0.2F, false));

        this.tail6 = new ModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.3F, 8.2F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.0F, 0.3054F, 0.0F);


        this.tail6_r2 = new ModelRenderer(this);
        this.tail6_r2.setRotationPoint(0.0F, 0.1F, 0.1F);
        this.tail6.addChild(tail6_r2);
        this.setRotateAngle(tail6_r2, 0.0873F, 0.0F, 0.0F);
        this.tail6_r2.cubeList.add(new ModelBox(tail6_r2, 47, 1, -0.5F, 0.4844F, -0.0532F, 1, 1, 11, -0.2F, false));

        this.legBackL = new ModelRenderer(this);
        this.legBackL.setRotationPoint(5.0F, 4.2F, 1.9F);
        this.bodyBack.addChild(legBackL);
        this.setRotateAngle(legBackL, 0.09F, 0.2605F, 0.0309F);


        this.legBackLLower = new ModelRenderer(this);
        this.legBackLLower.setRotationPoint(4.0948F, 4.602F, -5.8339F);
        this.legBackL.addChild(legBackLLower);
        this.setRotateAngle(legBackLLower, -0.3562F, 0.1994F, -0.6041F);


        this.legBackLFoot = new ModelRenderer(this);
        this.legBackLFoot.setRotationPoint(-0.3689F, 5.0517F, 1.0962F);
        this.legBackLLower.addChild(legBackLFoot);
        this.setRotateAngle(legBackLFoot, 0.3896F, -0.6821F, 0.3178F);


        this.legBackL2 = new ModelRenderer(this);
        this.legBackL2.setRotationPoint(-4.0F, 4.2F, 1.9F);
        this.bodyBack.addChild(legBackL2);
        this.setRotateAngle(legBackL2, 0.079F, 0.9138F, 0.0752F);


        this.legBackLLower2 = new ModelRenderer(this);
        this.legBackLLower2.setRotationPoint(-4.0948F, 4.602F, -5.8339F);
        this.legBackL2.addChild(legBackLLower2);
        this.setRotateAngle(legBackLLower2, 0.7854F, 0.0F, 0.0F);


        this.legBackLFoot2 = new ModelRenderer(this);
        this.legBackLFoot2.setRotationPoint(-1.6311F, 5.4517F, 0.7962F);
        this.legBackLLower2.addChild(legBackLFoot2);
        this.setRotateAngle(legBackLFoot2, -0.3182F, 0.079F, -0.0687F);

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
